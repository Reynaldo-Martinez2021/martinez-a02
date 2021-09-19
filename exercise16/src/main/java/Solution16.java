import java.util.Scanner;

public class Solution16 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Legal Driving Age
     *  Constraints: single output statement, use ternary operator to write program
     *
     *  Pseudocode:
     *  Prompt user for age 'userAge'
     *  Compare age with legal driving age 16
     *  Use ternary operator to determine over or under legal age
     *  use single output statement
     */
    private static final Scanner input = new Scanner(System.in);

    private int getUserAge(){
        System.out.print("What is your age? ");
        return input.nextInt();
    }

    public static void main(String[] args){
        Solution16 app = new Solution16();
        int userAge = app.getUserAge();
        System.out.print((userAge >= 16)? "You are old enough to legally drive": "You are not old enough to legally drive");
    }
}
