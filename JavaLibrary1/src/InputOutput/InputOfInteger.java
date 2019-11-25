/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author yorongra_sd2081
 */
public class InputOfInteger {
    private double number;
    private int intNumber;
    
    Scanner input = new Scanner(System.in);
    
    public double getInput(){
        number = input.nextDouble();
        return number;
    }
    public int getIntInput(){
        intNumber = input.nextInt();
        return intNumber;
    }
    
    
}
