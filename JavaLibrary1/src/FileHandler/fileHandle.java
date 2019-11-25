package FileHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yorongra_sd2081
 */
public class fileHandle {

    public String addUser(String firstname, String lastname, String user, String pass) {
        try {
            String str = firstname + " " + lastname+ " " + user + " " + pass + "\r\n";
            // Open given file in append mode. 
            BufferedWriter out = new BufferedWriter(new FileWriter("Z:\\sample.txt", true));
            out.append(str);
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
        return "" + firstname + " is added!";
    }

    public String viewUsers() throws FileNotFoundException, IOException {
        String values = "";
        BufferedReader br = new BufferedReader(new FileReader("Z:\\sample.txt"));
        for (String line; (line = br.readLine()) != null;) {
            String[] lines = line.split(" ");
            for(String inside: lines){
                values += inside + ", ";
            }
        }
        br.close();
        return values;
    }

}
