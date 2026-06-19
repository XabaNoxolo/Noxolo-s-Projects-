/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package za.ac.tut.model.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author xaban
 */
@Stateful
public class AnalyzeSB implements AnalyzeSBLocal {
    private List<String> messages = new ArrayList<>();

    @Override
    public void addMessage(String message) {
        messages.add(message);
    }

    @Override
    public int getLength(String message) {
        return message.length();
    }

    @Override
    public int countCommas(String message) {
        int commas = 0;
        for(int i=0; i < message.length(); i++){
            if(message.charAt(i) == ','){
                commas++;
            }
        }
        return commas;
    }

    @Override
    public int countFullStops(String message) {
        int fullStops = 0;
        for(int i =0; i < message.length(); i++){
            if(message.charAt(i) == '.'){
                fullStops++;
            }
        }
        return fullStops;
    }

    @Override
    public String getUniqueWords(String message) {
        String[] words = message.toLowerCase().split("\\s+");
        String unique = "";
        for(int i =0 ; i < words.length; i++){
            int count = 0;
            for(int j =0; j < words.length; j++){
                if(words[i].equals(j)){
                    count++;
                }
            }
            if(count == 1 && !unique.contains(words[i])){
                unique = unique + words[i] + "";
            }
        }
        return unique;
    }

    @Override
    public String getNonUniqueWords(String message) {
        String[] words = message.toLowerCase().split("\\s+");
        String nonUnique = "";
        for(int i =0 ; i < words.length; i++){
            int count = 0;
            for(int j=0; j < words.length; i++){
                if(words[i].equals(j)){
                    count++;
                }
            }
            if(count > 1 && !nonUnique.contains(words[i])){
                nonUnique = nonUnique + words[i] + "";
            }
        }
        return nonUnique;
    }

    @Override
    public String getfrequency(String message) {
        String[] words = message.toLowerCase().split("\\s+");
        String frequency = "";
        for(int i =0; i < words.length; i++){
            int count = 0;
            for(int j = 0; j < words.length; j++){
                if(words[i].equals(j)){
                    count++;
                }
            }
            if(count > 1 && !frequency.contains(words[i])){
                frequency = frequency + words[i] + "";
            }
        }
        return frequency;
    }

    @Override
    public List<String> getMessage() {
        return messages;
    }

    @Override
    public int getMessageCount() {
        return messages.size();
    }
    /* 
    If a word appears once → count = 1 ❌ (not repeated)
If a word appears more than once → count > 1 ✅ (duplicate)
// unique words → count == 1
        if (count == 1) {
    
    */
    
    
    
    
 
    
}
