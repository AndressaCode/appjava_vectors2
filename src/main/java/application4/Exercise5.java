/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Exercise5 {
    
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int vectA [] = new int[10];
        int vectB [] = new int[10];
        
        for(int i=0; i<vectA.length; i++){
            System.out.printf("Enter element %d: ", i+1);
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i] * i;
        }
        
        System.out.println();
        System.out.print("Vector A = ");
        for(int i=0; i<vectA.length; i++){
            System.out.print(vectA[i] + " ");
        }
        
        System.out.println();
        System.out.print("Vector B = ");
        for(int i=0; i<vectB.length; i++){
            System.out.print(vectB[i] + " ");
        }
        
    }
    
}
