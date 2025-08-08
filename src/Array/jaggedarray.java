package loops;

import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int employees = sc.nextInt();
        sc.nextLine();
        String[][] employee = new String[employees][];

        for (int i = 0; i < employees; i++) {
            System.out.print("Enter number of projects done by employee " + (i + 1) + ": ");
            int projects = sc.nextInt();
            sc.nextLine(); 

            employee[i] = new String[projects];

            for (int j = 0; j < projects; j++) {
                System.out.print("Enter name of project " + (j + 1) + ": ");
                employee[i][j] = sc.nextLine();
            }
        }

        
        System.out.println("\nProjects:");
        for (int i = 0; i < employees; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < employee[i].length; j++) {
                System.out.print(employee[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}