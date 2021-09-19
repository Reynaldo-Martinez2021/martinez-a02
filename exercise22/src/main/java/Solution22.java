import java.util.Scanner;

import static java.lang.System.exit;

public class Solution22 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Comparing Numbers
     *  Constraints: Write the algorithm manually. Don't use a built-in function
     *
     *  PseudoCode:
     *  Ask user for three numbers 'userNumberOne' 'userNumberTwo' 'userNumberThree'
     *  compare the three numbers to see if they're unique
     *  write if else statement for checking the largest
     *  Print out the largest one
     */

    private static final Scanner input = new Scanner(System.in);

    private int getUserNumber(String prompt){
        System.out.print(prompt);
        return input.nextInt();
    }

    private void validateInput(int numberOne, int numberTwo){
        if(numberOne == numberTwo)
            exit(1);
    }

    private void compareUserNumbers(int userNumberOne, int userNumberTwo, int userNumberThree){
        int max = userNumberOne;
        if(max < userNumberTwo){
            max = userNumberTwo;
        }
        if(max < userNumberThree) {
            max = userNumberThree;
        }
        System.out.printf("The largest number is %d", max);
    }

    public static void main(String[] args){
        Solution22 app = new Solution22();
        int userNumberOne = app.getUserNumber("Enter the first number: ");
        int userNumberTwo = app.getUserNumber("Enter the second number: ");
        app.validateInput(userNumberOne, userNumberTwo);
        int userNumberThree = app.getUserNumber("Enter the third number: ");
        app.validateInput(userNumberTwo,userNumberThree);
        app.compareUserNumbers(userNumberOne, userNumberTwo, userNumberThree);
    }
}
