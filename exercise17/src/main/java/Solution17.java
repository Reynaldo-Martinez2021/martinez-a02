import java.util.Scanner;

public class Solution17 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Blood Alcohol Content Calculator
     *  Constraints: Prevent user from entering non-numeric values
     *
     *  Pseudocode:
     *  Ask user for weight gender alcohol consumed (ounces) and amount of time since last drink
     *  'userWeight' 'userGender' 'amtOfAlcohol' 'timeSinceLastDrink'
     *  Formula: BAC = (amtOfAlcohol * 5.14 / userWeight * (0.73 M or 0.66 F)) - 0.15 * timeSinceLastDrink
     *  compare BAC to 0.08
     *  Determine whether its legal to drive
     */
    private static final Scanner input = new Scanner(System.in);

    private int getInput(String prompt){
        System.out.print(prompt);
        String number = input.nextLine();
        return validateInput(number);
    }

    private int validateInput(String number) throws NumberFormatException {
        return Integer.parseInt(number);
    }

    private double calculateBAC(int userGender, int amtOfAlcohol, int userWeight, int timeSinceLastDrink){
        if(userGender == 1){
            return (amtOfAlcohol * 5.14 / userWeight * 0.73) - .015 * timeSinceLastDrink;
        }

        return (amtOfAlcohol * 5.14 / userWeight * 0.66) - .015 * timeSinceLastDrink;
    }

    private void determineIfLegalToDrive(double BAC){
        if(BAC > 0.08){
            System.out.printf("%nYour BAC is %f%nIt is not legal for you to drive.", BAC);
        }else {
            System.out.printf("%nYour BAC is %f%nIt is legal for you to drive.", BAC);
        }
    }

    public static void main(String[] args){
        Solution17 app = new Solution17();
        int userGender = app.getInput("Enter 1 for male or 2 for female: ");
        int amtOfAlcohol = app.getInput("How many ounces of alcohol did you have? ");
        int userWeight = app.getInput("What is your weight, in pounds? ");
        int timeSinceLastDrink = app.getInput("How many hours has it been since your last drink? ");
        double userBAC = app.calculateBAC(userGender,amtOfAlcohol,userWeight,timeSinceLastDrink);
        app.determineIfLegalToDrive(userBAC);
    }
}
