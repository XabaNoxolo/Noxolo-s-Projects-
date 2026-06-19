/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateful;


/**
 *
 * @author xaban
 */
@Stateful
public class AnalyzeSB implements AnalyzeSBLocal {

    @Override
    public int countWords(String msg) {
        String[] words = msg.trim().split("\\s+");
        return words.length;
    }
    

    @Override
    public double frequency(int countWords, int totalWords) {
        return ((double) countWords/ totalWords) * 100;
    }

    @Override
    public int countCommas(String msg) {
        int count = 0;
        for(char c: msg.toCharArray()){
            if(c == ','){
                count ++;
            }
        }
        return count;
    }

    @Override
    public int countFullStops(String msg) {
        int count = 0;
        for(char c: msg.toCharArray()){
            if(c == '.'){
                count++;
            }
        }
        return count;
    }
    
    
    
    
    

    
    
    

    
}
