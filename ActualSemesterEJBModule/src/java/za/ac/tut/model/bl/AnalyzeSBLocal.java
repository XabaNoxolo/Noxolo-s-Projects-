/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author xaban
 */
@Local
public interface AnalyzeSBLocal {

    void addMessage(String message);

    int getLength(String message);

    int countCommas(String message);

    int countFullStops(String message);

    String getUniqueWords(String message);

    String getNonUniqueWords(String message);

    String getfrequency(String message);

    List<String> getMessage();

    int getMessageCount();

    
    
}
