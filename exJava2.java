/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjava;
import java.util.Scanner;
/**
 *
 * @author 2etimds
 */

public class exJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = scan.nextInt();
        System.out.println("Digite mais um número: ");
        num2 = scan.nextInt();
        result = (num1 + num2) / 2;
        
        if (result <0){
            System.out.println(result * -1);
        }
        else{
            System.out.println(result);
        }
        }
        
    }
   