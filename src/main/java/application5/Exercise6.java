/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Exercise6 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int vectA [] = new int[5];
        int vectB [] = new int[5];
        int vectC [] = new int[5];
        
        System.out.println("Vector A: ");
        for(int i=0; i<vectA.length; i++){
            System.out.printf("Enter element %d: ", i+1);
            vectA[i] = sc.nextInt();
        }
        System.out.printf("%n%n");
        System.out.println("Vector B: ");
        for(int i=0; i<vectB.length; i++){
            System.out.printf("Enter element %d: ", i+1);
            vectB[i] = sc.nextInt();
        }
        
        for(int i=0; i<vectA.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }
        
        System.out.printf("%n");
        System.out.print("Vector A = ");
        for(int i=0; i<vectA.length; i++){
            System.out.print(vectA[i] + " ");
        }
        
        System.out.printf("%n");
        System.out.print("Vector B = ");
        for(int i=0; i<vectB.length; i++){
            System.out.print(vectB[i] + " ");
        }
        System.out.printf("%n");
        System.out.println();
        System.out.print("Vector C = ");
        for(int i=0; i<vectB.length; i++){
            System.out.print(vectC[i] + " ");
        }
    }
    
}
