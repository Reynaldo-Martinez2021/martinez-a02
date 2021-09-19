import java.util.Scanner;

public class Solution14 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Tax Calculator
     *  Constraints: implement simple if no else, ensure all money is rounded to the nearest cent, use single output
     *
     *  Pseudocode:
     *  Prompt user for order amount and state 'orderAmt' 'orderState'
     *  if 'orderState' .equals('WI') order must be charged 5.5% tax (0.055)
     *  Display subtotal, tax and total
     *  Must use single output
     */
    private static final Scanner input = new Scanner(System.in);
    private static final double WISCONSIN_TAX = 0.055;

    private double getPriceInput(){
        System.out.print("What is the order amount? ");
        return input.nextDouble();
    }

    private String getStateInput(){
        System.out.print("What is the state? ");
        return input.nextLine();
    }

    public static void main(String[] args){
        Solution14 app = new Solution14();

        double orderAmt = app.getPriceInput();
        input.nextLine();
        String orderState = app.getStateInput();

        if(orderState.equals("WI")) {
            System.out.printf("The subtotal is $%.2f%nThe tax is $%.2f%nThe total is $%.2f", orderAmt, (WISCONSIN_TAX * orderAmt), Math.ceil((orderAmt + (WISCONSIN_TAX*orderAmt)) * 100) / 100);
            System.exit(0);
        }

        System.out.printf("The total is $%.2f", orderAmt);
    }
}
