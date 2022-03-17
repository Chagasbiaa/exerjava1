/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerjava1;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exerjava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Digite um número inteiro:");
        int num = x.nextInt(); 
        int i, result = 0;
        
        
        for (i = 0; i <= num; i++){
        result+=i;
        System.out.println (String.valueOf(result));
        
        }
               
        
    }
    
}
