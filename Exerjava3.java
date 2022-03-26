/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerjava3;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exerjava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0,result = 0, qtdDigitados= 0;
        Scanner x = new Scanner(System.in); 
        
        while(num >=0){
          System.out.println("Digite um número inteiro: ");
          num = x.nextInt();
          qtdDigitados += 1;
         if(num >=0){
              result+= num;
         }
         else {
             result = result /(qtdDigitados - 1);
             System.out.println(result);
         }
        }
        
        
    }
    
}
