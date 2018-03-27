/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpljurnal9;
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class RPLJURNAL9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner pramana = new java.util.Scanner(System.in);
        System.out.print("Test Case Input :  ");
        int r = pramana.nextInt();
        long dataangka[] = new long[r];
         
        dataangka[0] = 0;
        dataangka[1] = 1;
         
        for(int i = 2; i < r; i++) {
            dataangka[i] = dataangka[i-1] + dataangka[i-2];
        }
         
        for (int i = 0; i < r; i++) {
            System.out.print(dataangka[i] +  " ");
        }
        
    }
    
}
