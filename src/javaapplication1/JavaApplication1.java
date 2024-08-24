
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = keyboard.nextLine();
       
        System.out.print("enter age : ");
        int age = keyboard.nextInt();
        
        System.out.print("enter years born : ");
        int years = keyboard.nextInt();
       keyboard.nextLine();
        System.out.print("enter major: ");
        String major = keyboard.nextLine();
        
        System.out.print("enter GPA :");
        double gpa = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter hometown : ");
        String home = keyboard.nextLine();
      
        
        System.out.println(name + "-" + age + "-" + years + "-" + major + "-" +gpa + "-" + home);
    }
    
}
