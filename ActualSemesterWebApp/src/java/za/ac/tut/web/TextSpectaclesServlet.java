/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.exceptions.EmptyDataException;
import za.ac.tut.exceptions.InvalidMessageException;
import za.ac.tut.model.bl.AnalyzeSBLocal;

/**
 *
 * @author xaban
 */
public class TextSpectaclesServlet extends HttpServlet {
    @EJB
    private AnalyzeSBLocal tsb;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        String name = request.getParameter("name");
        String message = request.getParameter("message");
        String option = request.getParameter("option");

        try {

            if(option.equals("enter")){

                
                if(name == null || name.equals("") || message == null || message.equals("")){
                    throw new EmptyDataException("Please enter name and message");
                }

                if(message.matches(".*\\d.*")){
                    throw new InvalidMessageException("Message must not contain digits");
                }

                List messages = (List)session.getAttribute("messages");

                if(messages == null){
                    messages = new ArrayList();
                }

                messages.add(message);

                session.setAttribute("messages", messages);

                
                int length = tsb.getLength(message);
                int commas = tsb.countCommas(message);
                int fullStops = tsb.countFullStops(message);

                String unique = tsb.getUniqueWords(message);
                String nonUnique = tsb.getNonUniqueWords(message);
                String frequency = tsb.getfrequency(message);

                
                request.setAttribute("length", String.valueOf(length));
                request.setAttribute("commas", String.valueOf(commas));
                request.setAttribute("fullStops", String.valueOf(fullStops));
                request.setAttribute("unique", unique);
                request.setAttribute("nonUnique", nonUnique);
                request.setAttribute("frequency", frequency);

                RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
                disp.forward(request, response);
            }

            if(option.equals("summary")){

                RequestDispatcher disp = request.getRequestDispatcher("summary.jsp");
                disp.forward(request, response);
            }

        } 
        catch(EmptyDataException e){
            request.setAttribute("error", e.getMessage());
            RequestDispatcher disp = request.getRequestDispatcher("EmptyDataException.jsp");
            disp.forward(request, response);
        }
        catch(InvalidMessageException e){
            request.setAttribute("error", e.getMessage());
            RequestDispatcher disp = request.getRequestDispatcher("InvalidMessageException.jsp");
            disp.forward(request, response);
        }
        catch(FileNotFoundException e){
            request.setAttribute("error", "File not found");
            RequestDispatcher disp = request.getRequestDispatcher("FileNotFoundException.jsp");
            disp.forward(request, response);
        }
    
    }

}
