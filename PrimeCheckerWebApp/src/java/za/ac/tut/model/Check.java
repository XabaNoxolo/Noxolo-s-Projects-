/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author xaban
 */
public class Check {
    public boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        for(int i=2; i <= num/2; i++){
             if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
