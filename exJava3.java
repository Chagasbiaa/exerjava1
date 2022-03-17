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
public class exJava3 {
    
    public static void main(String[] args){
        
    int x, c, result;
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número: ");
    x = scan.nextInt();
    
    for(c=1; c < x; c++){
        result = c + c++;
        
        System.out.println(result);
        
    }
}
}
