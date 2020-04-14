/*
 * Implement a vector A with 8 elements. Then, create a vector B with the vector A
 * elements multiplied by 2. For example, vectB[i] = vectA[i] * 2
*/

package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Vectors21 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int vectA [] = new int[8];
        int vectB [] = new int[8];
        
        for(int i=0; i<vectA.length; i++){
            System.out.printf("Enter element %d: ", i+1);
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i] * 2;
        }
        System.out.println();
        System.out.print("Vector A = ");
        for(int i=0; i<vectA.length; i++){
            System.out.print(vectA[i] + " ");
        }
        System.out.println();
        System.out.print("Vector B = ");
        for(int i=0; i<vectA.length; i++){
            System.out.print(vectB[i] + " ");
        }
    }
}
