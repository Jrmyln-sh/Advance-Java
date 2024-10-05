/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static Registration.user_pass usrpsd = new Registration.user_pass();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            System.out.println("Choose: 1. Registration 2. Login");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                Registration.registration(scanner, usrpsd);
            } else if (choice == 2) {
                if (Login.login(usrpsd, scanner)) {
                    System.out.println("Successfully logged in");
                    break;
                } else {
                    System.out.println("Incorrect credentials.");
                }
            } else {
                System.out.println("Invalid Choice. Please choose 1 or 2");
            }
        }
    }
    
}
