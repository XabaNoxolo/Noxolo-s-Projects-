
import boxer.Boxer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaban
 */
public class BoxingFight {
    private Boxer boxer1;
    private Boxer boxer2;

    public BoxingFight(String boxerName1,String boxerName2) {
        this.boxer1 = new Boxer(boxerName1);
        this.boxer2 = new Boxer(boxerName2);
        
    }

    public Boxer getBoxer1() {
        return boxer1;
    }

    public Boxer getBoxer2() {
        return boxer2;
    }
    public String possibleWinner(int numberOfFights1,int numberOfWins1,int numberOfNockOuts1,int numberOfFights2,int numberOfWins2,int numberOfNockOuts2){
        double possibility1 = boxer1.winningPossibility(numberOfWins1, numberOfFights1, numberOfNockOuts1);
        double possibility2 = boxer2.winningPossibility(numberOfWins2, numberOfFights2, numberOfNockOuts2);
        if(possibility1 > possibility2){
            return boxer1.getBoxerName();
        }else if(possibility2 > possibility1){
            return boxer1.getBoxerName();
        }else{
            return "It's a tie!";
        }
    }
    
    
    
}
