/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathOperations;

import InputOutput.InputOfInteger;

/**
 *
 * @author yorongra_sd2081
 */
public class quadratic {
    private double a = 0;
    private double b = 0;
    private double c = 0;
    
    
    public double getQuadraticPositive(){
        InputOfInteger first = new InputOfInteger();
        InputOfInteger second = new InputOfInteger();
        InputOfInteger third = new InputOfInteger();
        a = first.getInput();
        b = second.getInput();
        c = third.getInput();
         
        double x = (-b + (Math.sqrt(b*b - 4*(a*c))))/2*a;
        return x;
    }
    public double getQuadraticNegative(){
        double x = (-b - (Math.sqrt(b*b - 4*(a*c))))/2*a;
        return x;        
    }
    
}
