
package application6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Exercise7 {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        double vect[] = new double[n];
        
        double sum = 0;
        for(int i=0; i<vect.length; i++){
            System.out.printf("Enter height # %d: ", i+1);
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        
        System.out.printf("Med Height: %.2f", sum/vect.length);
    }
}
