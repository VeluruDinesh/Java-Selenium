package loops;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int[][] atm = {
            {2000, 0, 0},
            {500,  0, 0},
            {100,  0, 0}
        };

      
        System.out.println("Enter number of notes for each denomination:");
        for (int i = 0; i < atm.length; i++) {
            System.out.print("₹" + atm[i][0] + ": ");
            atm[i][1] = sc.nextInt(); 
            atm[i][2] = atm[i][0] * atm[i][1]; 
        }

        
        System.out.println("\nATM Cash Summary:");
        int grandTotal = 0;
        for (int i = 0; i < atm.length; i++) {
            System.out.println("₹" + atm[i][0] + " x " + atm[i][1] + " = ₹" + atm[i][2]);
            grandTotal += atm[i][2];
        }

        System.out.println("Total Cash in ATM: ₹" + grandTotal);

        sc.close();
    }
}
