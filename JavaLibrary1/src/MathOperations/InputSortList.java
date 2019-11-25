/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yorongra_sd2081
 */
public class InputSortList {

    public List doubleList = new ArrayList();

    public void getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many number: ");
        int enter = scan.nextInt();
        String list[] = new String[enter];
        int count = 1;
        for (int i = 0; i < enter; i++) {
            System.out.println("Number " + count);
            list[i] = scan.next();
            count++;
        }
        while(true){
        for (String val : list) {
            try {
                int num = Integer.parseInt(val);
                System.out.println("You've entered and invalid number " + num);
                System.out.println("You should enter a decimal number: ");
                String input = scan.next();
                try {
                    int convert = Integer.parseInt(input);
                    System.out.println("Your input "+convert+" will now not accepted");
                    System.out.println("Your input is invalid!");
                }catch(NumberFormatException nfe){
                    try{
                       double newDou = Double.parseDouble(input);
                       doubleList.add(newDou);
                    }catch(NumberFormatException nfe2){
                        System.out.println("Your input is not accepted");
                        System.out.println("It will not appeared to the List!");
                    }
                }

            } catch (NumberFormatException e) {
                try {
                    double dou = Double.parseDouble(val);
                    doubleList.add(dou);
                } catch (NumberFormatException e2) {
                    System.out.println("You've entered a word not a number " + val);
                    System.out.println("You should enter a decimal number: ");
                    String input2 = scan.next();
                try {
                    int convert = Integer.parseInt(input2);
                    System.out.println("Your input "+convert+" will now not accepted");
                    System.out.println("Your input is invalid!");
                }catch(NumberFormatException nfe){
                    try{
                       double newDou = Double.parseDouble(input2);
                       doubleList.add(newDou);
                    }catch(NumberFormatException nfe2){
                        System.out.println("Your input is not accepted");
                        System.out.println("It will not appeared to the List!");
                    }
                }
                }
            }
        }
        Collections.sort(doubleList);
        System.out.println(doubleList);
    }
}
}
