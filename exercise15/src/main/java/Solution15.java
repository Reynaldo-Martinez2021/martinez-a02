import java.util.Scanner;

public class Solution15 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Password Validation
     *  Constraints: use an if/else & make sure program is case-sensitive
     *
     *  Pseudocode:
     *  create a private static String containing known password
     *  prompt user for username 'userName'
     *  prompt user for password 'userPassword'
     *  use if/else to decide whether it's a welcome or I don't know you
     */
    private static final Scanner input = new Scanner(System.in);
    private static final String PASSWORD = "abc$123";

    private String getInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    private void validatePassword(String userPassword, String userName){
        if(userPassword.equals(PASSWORD)){
            System.out.printf("Welcome %s!", userName);
        }
        else{
            System.out.printf("I don't know you %s", userName);
        }
    }

    public static void main(String[] args){
        Solution15 app = new Solution15();
        String userName = app.getInput("What is your username? ");
        String userPassword = app.getInput("What is your password? ");
        app.validatePassword(userPassword,userName);
    }
}
