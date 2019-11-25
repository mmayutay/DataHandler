/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathOperations;

import java.util.Scanner;


/**
 *
 * @author yorongra_sd2081
 */
public class AverageSolving {
    
    public double num;
    
    public void getAve() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int size = scan.nextInt();
        String list[] = new String[size];
        int count = 1;
        for(int i = 0; i < size; i++){
            System.out.println("Number "+count);
            list[i] = scan.next();
            count += 1;
        }
        for(String val : list){
            try{
                double dou = Double.parseDouble(val);
                num += dou;
                
            }catch(NumberFormatException e){
                System.out.println("Ayaw pagdinang.....ilisi ang " + val);
                System.out.println("Number ibutang dili word!!");
                String chan = scan.next();
                double convert = Double.parseDouble(chan);
                num += convert;
            }
        }
        System.out.println("The total is: "+num);
        System.out.println("The average is: "+num / size);
    }
}
