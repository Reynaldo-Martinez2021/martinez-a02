import java.util.Scanner;

public class Solution21 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Numbers to name
     *  Constraints: use a switch or case statement for program, use a single output
     *
     *  PseudoCode:
     *  Ask user for a number 'userNumber'
     *  Create a method and call using a switch case for numbers 1-12
     *  That method will return a string to corresponding month
     *  Use single output state to print the month
     */
    private static final Scanner input = new Scanner(System.in);

    private int getUserNumber(){
        System.out.print("Please enter the number of the month: ");
        return input.nextInt();
    }

    private String getUserMonth(int userNumber){
        return switch (userNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }

    private void printOutput(String userMonth){
        if(userMonth.equals("Invalid month")){
            System.out.print("The number you entered is invalid for a month");
        }else{
            System.out.printf("The name of the month is %s.", userMonth);
        }
    }

    public static void main(String[] args){
        Solution21 app = new Solution21();
        int userNumber = app.getUserNumber();
        String userMonth = app.getUserMonth(userNumber);
        app.printOutput(userMonth);
    }
}
