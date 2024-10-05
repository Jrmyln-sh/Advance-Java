package main;
import java.util.Scanner;
/**
 *
 * @author Jeremy
 */
public class Registration {
    public static void registration(Scanner scanner, user_pass user_pass) {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Hobbies: ");
        String hobbies = scanner.nextLine();
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        
        user_pass.Set_username(username);
        user_pass.Set_password(password);
        
        System.out.println("Registration successful. You can now login.");
    }
    
    public static class user_pass {
        private String username;
        private String password;
        
        public void Set_username(String username) {
            this.username = username;
        }
        public void Set_password(String password) {
            this.password = password;
        }
        public String Get_Username() {
            return username;
        }
        public String Get_Password() {
            return password;
        }
    }
    
}
