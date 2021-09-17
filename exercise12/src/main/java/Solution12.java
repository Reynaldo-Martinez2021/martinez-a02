import java.util.Scanner;

public class Solution12 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Computing Simple Interest
     *  Constraints: prompt rate of interest like 15 not 0.15, ensure fractions are rounded up, output is formatted as money
     *
     *  Pseudocode:
     *  Ask user for principal amount 'principalAmount'
     *  Ask use for rate as percentage then divide by 100 'rateOfInterest'
     *  ask user for time 'timeOfInvestment'
     *  Formula is A= P(1 +rt) or amountAtEndInvestment = principalAmount(1+ rateOfInterest*timeOfInvestment)
     */

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int principalAmount = new Solution12().getPrincipal(input);
        double rateOfInterest = new Solution12().getInterestRate(input);
        int investmentTime = new Solution12().getInvestmentTime(input);
        double totalInvestment = new Solution12().totalInvestment(principalAmount,rateOfInterest,investmentTime);

        System.out.printf("After %d years at %.1f, the investment will be worth $%.2f", investmentTime, rateOfInterest, totalInvestment);
    }

    public int getPrincipal(Scanner input){
        System.out.print("Enter the principal: ");
        return input.nextInt();
    }

    public double getInterestRate(Scanner input){
        System.out.print("Enter the rate of interest: ");
        return input.nextDouble();
    }

    public int getInvestmentTime(Scanner input){
        System.out.print("Enter the number of years: ");
        return input.nextInt();
    }

    public double totalInvestment(int principalAmount, double rateOfInterest, int investmentTime){
        double totalInvestment = principalAmount*(1+(rateOfInterest/100)*investmentTime);
        return Math.ceil(totalInvestment*100)/100;
    }
}
