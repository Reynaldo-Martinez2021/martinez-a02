import java.util.Scanner;

public class Solution13 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Determining Compound interest
     *  Constraints: prompt rate of interest like 15 not 0.15, ensure fractions are rounded up, output is formatted as money
     *
     *  Ask user for starting amount 'startingAmount'
     *  Ask user for number of years 'numberOfYears'
     *  ask user for interest rate 'interestRate'
     *  ask user for number of periods 'amtOfPeriods'
     *  Formula A = P(1+r/n)^(n*t) OR startingAmount * (1 + interestRate/amtOfPeriods)math.pow(amtOfPeriods*numberOfYears)
     *  format in one line and make sure numbers look like money
     */
    private static final Scanner input = new Scanner(System.in);

    private int getInput(String prompt){
        System.out.print(prompt);
        return input.nextInt();
    }

    private double getInterestRate(){
        System.out.print("Enter the rate of interest? ");
        return input.nextDouble();
    }

    private double totalInvestment(int principalAmount, double rateOfInterest, int investmentTime, int amtOfPeriods){
        double totalInvestment = principalAmount * Math.pow(1+rateOfInterest/amtOfPeriods, (amtOfPeriods*investmentTime));
        return Math.ceil(totalInvestment*100)/100;
    }

    public static void main(String[]args) {
        Solution13 app = new Solution13();
        int principalAmount = app.getInput("What is the principal amount? ");
        int investmentTime = app.getInput("Enter the number of years? ");
        int amtOfPeriods = app.getInput("What is the number of times the interest is compounded per year? ");

        double rateOfInterest = app.getInterestRate();
        double totalInvestment = app.totalInvestment(principalAmount,(rateOfInterest/100.0),investmentTime,amtOfPeriods);

        System.out.printf("$%d invested at %.1f for %d years compounded %d times per year is $%.2f",principalAmount,rateOfInterest,investmentTime,amtOfPeriods,totalInvestment);
    }
}
