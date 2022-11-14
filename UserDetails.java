// A Create a Java class called Student with the following details as variables within it. (i) USN (ii)
// Name (iii) Branch (iv) Phone no. Write a Java program to create nStudent objects and print the
// USN, Name, Branch, and Phone no. of these objects with suitable headings.

import java.util.Scanner;


public class UserDetails{
    public static void main(String[] args) {
        // String USN, Name, Branch;
        // long Phone;
        Scanner sc = new Scanner(System.in);

        System.out.print("USN: ");
        String USN = sc.nextLine();

        System.out.print("Name: ");
        String Name = sc.nextLine();

        System.out.print("Branch: ");
        String Branch = sc.nextLine();

        System.out.print("Phone: ");
        String Phone = sc.nextLine();

        
        
        System.out.println("--- --- --- --- --- ---");
        System.out.println("User Input Details");
        System.out.println("Name: "+Name);
        System.out.println("USN: "+USN);
        System.out.println("Branch: "+Branch);
        System.out.println("Phone: "+Phone);
       
    }
}