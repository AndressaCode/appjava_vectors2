/*
 * Implement a vector A with 15 elements. Then, create a vector B with the vector A
 * elements elevated by 2. For example, vectB[i] = vectA[i] * vectA[].
*/

package application2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Exercise3 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int vectA [] = new int[15];
        int vectB [] = new int[15];
        
        for(int i=0; i<vectA.length; i++){
            System.out.printf("Enter element %d: ", i+1);
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i] * vectA[i];
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
