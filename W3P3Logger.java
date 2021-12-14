import java.util.Scanner;
import java.util.HashMap;

public class W3P3Logger{
    public static void main(String[] arg){
        HashMap<String, String> userInfo = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("What would you like to do? Enter the number for the option you want to chose!");
            System.out.println("1. Sign up for a new account.");
            System.out.println("2. Log into an existing account.");
            System.out.println("3. Exit.");
            int response = input.nextInt();
            if (response == 1){
                System.out.println("Please enter your desired username.");
                String newName = input.next();
                System.out.println("What would you like your password to be?");
                String newPassword = input.next();
                userInfo.put(newName, newPassword);
                System.out.println("Your account has been registered. Have a good day!");
                break;
            } else if (response == 2){
                System.out.println("What is your username?");
                String username = input.next();
                if (userInfo.containsKey(username) == false){
                    System.out.println("That username doesn't exist, please register an account first.");
                    continue;
                }
                System.out.println("What is your password?");
                String password = input.next();
                if (password != userInfo.get(username)){
                    System.out.println("That's the incorrect password, try again.");
                    password = input.next();
                    if (password != userInfo.get(username)){
                        System.out.println("That's the incorrect password, try again.");
                        password = input.next();
                        if (password != userInfo.get(username)){
                            System.out.println("That's the incorrect password, no more tries.");
                            break; 
                        } else {
                            System.out.println("You have been logged in successfully.");
                            break; 
                        }
                    } else {
                        System.out.println("You have been logged in successfully.");
                        break; 
                    }
                } else {
                    System.out.println("You have been logged in successfully.");
                    break; 
                }
            } else if (response == 3){
                break;
            } 
        }
    }
}