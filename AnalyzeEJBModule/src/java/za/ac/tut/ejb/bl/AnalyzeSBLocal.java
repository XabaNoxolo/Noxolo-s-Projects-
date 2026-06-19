/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Local;

/**
 *
 * @author xaban
 */
@Local
public interface AnalyzeSBLocal {

    int countWords(String msg);

    double frequency(int countWords, int totalWords);

    int countCommas(String msg);

    int countFullStops(String msg);

    

    
    
}
