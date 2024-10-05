package main;
import java.util.Scanner;
/**
 *
 * @author Jeremy
 */
public class Login {
    public static boolean login(Registration.user_pass user_pass, Scanner scanner) {
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        
        return username.equals(user_pass.Get_Username()) && password.equals(user_pass.Get_Password());
    }
}
