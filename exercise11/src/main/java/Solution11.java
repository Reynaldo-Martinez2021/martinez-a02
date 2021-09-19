import java.util.Scanner;

public class Solution11 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Currency Conversion
     *  Constraints: Fractions of a cent are rounded up to penny (%.2f), single output
     *
     *  PseudoCode:
     *  Ask user for amount of euros 'tempAmtEuros'
     *  Ask user for conversion rate 'conversionRate'
     *  Calculate all of it in a single output
     */
    private static final Scanner input = new Scanner(System.in);

    private int getAmtOfEuro(Scanner input){
        System.out.print("How many euros are you exchanging? ");
        return input.nextInt();
    }

    private double getExchangeRate(Scanner input){
        System.out.print("What is the exchange rate? ");
        return input.nextDouble();
    }

    public static void main(String[] args){
        Solution11 app = new Solution11();
        int amtOfEuros = app.getAmtOfEuro(input);
        double exchangeRate = app.getExchangeRate(input);
        System.out.printf("%d euros at an exchange rate of %.4f is %.2f U.S. dollars", amtOfEuros, exchangeRate,Math.ceil(amtOfEuros*exchangeRate*100)/100);
    }

}
