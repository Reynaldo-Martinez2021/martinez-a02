import java.util.Scanner;

public class Solution20 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Multi-state Sales Tax Calculator
     *  Constraints: Ensure all money rounded to the nearest cent, use single output for final display
     *
     *  Pseudocode:
     *  Ask user for orderAmount and state 'userOrderAmount' 'userState'
     *  For wisconsin must be charged for %5 sales tax
     *      Ask wisconsin residents for county level
     *      Eau claire is 0.5% additional
     *      Dunn is additional 0.4% tax
     *  Illinois residents charged 8% tax
     *  All other states no tax
     */

    private static final Scanner input = new Scanner(System.in);

    private int getOrderAmount(){
        System.out.print("What is the order amount? ");
        return input.nextInt();
    }

    private String getState(){
        System.out.print("What state do you live in? ");
        return input.nextLine();
    }

    private double calculateTax(String userState, int userOrderAmount){
        if(userState.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = input.nextLine();
            if(county.equals("Eau Claire")){
                return (userOrderAmount * 0.05) + (userOrderAmount * 0.005);
            }else if(county.equals("Dunn")){
                return (userOrderAmount * 0.05) + (userOrderAmount * 0.004);
            }
            else {
                return (userOrderAmount * 0.05);
            }
        }else if(userState.equals("Illinois")){
            return (userOrderAmount * 0.08);
        }else
            return (userOrderAmount * 1.0);
    }

    private void printOutput(double userTax, double userOrderAmount){
        System.out.printf("The tax $%.2f%nThe total is $%.2f", userTax, Math.ceil((userOrderAmount + userTax)*100)/100);
    }

    public static void main (String[] args){
        Solution20 app = new Solution20();
        int userOrderAmount = app.getOrderAmount();
        input.nextLine();
        String userState = app.getState();
        double userTax = app.calculateTax(userState, userOrderAmount);
        app.printOutput(userTax, userOrderAmount);
    }

}
