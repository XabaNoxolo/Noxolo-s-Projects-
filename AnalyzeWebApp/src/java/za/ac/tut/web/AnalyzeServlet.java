/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

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
import za.ac.tut.ejb.bl.AnalyzeSBLocal;
import za.ac.tut.exceptions.EmptyDataException;
import za.ac.tut.exceptions.InvalidMessageException;

/**
 *
 * @author xaban
 */
public class AnalyzeServlet extends HttpServlet {
   @EJB
   private AnalyzeSBLocal an;
   
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        try{
            String name = request.getParameter("name");
        String message = request.getParameter("message");
        
        if(name == null || name.trim().equals("") || 
            message == null || 
            message.trim().equals("")) 
             throw new EmptyDataException("Name or message missing");
        if(message.matches (".*\\d.*"))
            throw new InvalidMessageException("Message can't have digits");
        
        
        int length = message.length();
        int words = an.countWords(message);
        int frequency = (int) an.frequency(words, length);
        int commas = an.countCommas(message);
        int fullStops = an.countFullStops(message);
        
        List messages = (List)session.getAttribute("messages");
        if(messages == null)
            messages = new ArrayList();
        messages.add(message);
        session.setAttribute("messages", messages);
       
        session.setAttribute("length",length);
        session.setAttribute("words",words );
        session.setAttribute("frequency",frequency );
        session.setAttribute("commas",commas);
        session.setAttribute("fullStops",fullStops);
        
        RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
        disp.forward(request, response);
        }
        catch(Exception e) {
            request.setAttribute("error", e.getMessage());
            RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
            disp.forward(request, response);
        }


    }

    
}
