/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author xaban
 */
public class Fight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BoxingFight fight = new BoxingFight("Mike Tyson","Muhammed Ali");
        String Winner = fight.possibleWinner(3,1,3,3,3,0);
        System.out.println("The possible winner is " + Winner);
    }
    
}
