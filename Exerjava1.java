/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerjava1;

import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {
        String [] exc ={"", "onze", "doze", "treze", "quatorze", "quinze", 
        "dezesseis", "dezessete", "dezoito", "dezenove"};
        String [] cem = {"", "cem"};
        String[] unit = {"zero", "um","dois", "três", "quatro", "cinco", "seis", 
        "sete", "oito", "nove"};
        String[] dezen = {"","dez","vinte", "trinta", "quarenta", "cinquenta", 
        "sessenta", "setenta", "oitenta", "noventa"};
        String [] cent ={"", "cento", "duzentos", "trezentos", "quatrocentos", 
        "quinhetos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
      
        int[] num = new int [3];
        
        try (Scanner ex = new Scanner(System.in)) {
            System.out.print("Escreva a centena: ");
            num[0] = ex.nextInt();
            
            System.out.print("Escreva a dezena: ");
            num[1] = ex.nextInt();
            
            System.out.print("Escreva a unidade: ");
            num[2] = ex.nextInt();
        }
        
        if((num[1] == 0) & (num[0] == 0)){
            System.out.println(unit[num[2]]);
        }
        else if((num[0] == 1) & (num[1] == 0) & (num[2] == 0)){
            System.out.println(cem[num[0]]);
        }
        else if((num[2] == 0) & (num[1] == 0)){
            System.out.println(cent[num[0]]);
        }
        else if(num[2] == 0){
            System.out.println(cent[num[0]] + " e " + dezen[num[1]]);
        }
        else if((num[1] == 1) & (num[2] == 7)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 1)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if(num[1] == 0){
            System.out.print(cent[num[0]] + " e " + unit[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 2)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 3)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 8)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 9)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 4)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 5)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else if((num[1] == 1) & (num[2] == 6)){
            System.out.println(cent[num[0]] + " e " + exc[num[2]]);
        }
        else{
            System.out.println(cent[num[0]] + " e " 
        + dezen[num[1]] + " e " + unit[num[2]]);
        }
    }

}
