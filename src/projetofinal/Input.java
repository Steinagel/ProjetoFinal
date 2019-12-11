/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author will_
 */
public class Input {
    public static String getInput(String prompt){
      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

      System.out.print(prompt);
      System.out.flush();

      try{
          return stdin.readLine();
      } catch (Exception e){
        return "Error: " + e.getMessage();
      }
    }
    
    public static String validInput(String prompt, String[] args){
        int count;
        String validate;
        do{
            validate = getInput(prompt).toUpperCase();
            count=0;
            for(String str:args){
                if(!str.toUpperCase().equals(validate))
                    count++;
            }
            if(count==args.length){
                System.out.println("Valor invalido! Digite Novamente.");
            }
        }while(count==args.length);
        
        return validate.toUpperCase();
    }

}
