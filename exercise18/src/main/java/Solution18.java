import java.util.Scanner;

public class Solution18 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Temperature Converter
     *  Constraints: allow upper or lowercase values for C and F, use as few output statements as possible
     *
     *  PseudoCode:
     *  Need to create a program that will switch C with F and vice versa
     *  Create method to display options
     *  C = (F - 32) * 5/9
     *  F = (C * 9 / d) + 32
     *  Prompt user for a C or F for the respective temp
     *  Create a method to determine the conversion
     *  make sure it is case-insensitive
     */
    private static final Scanner input = new Scanner(System.in);

    private void displayOptions(){
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%n");
    }

    private String getUserOption(){
        System.out.print("Your choice: ");
        return input.nextLine();
    }

    private int determineOptionPath(String userOption){
        if(userOption.equalsIgnoreCase("c")){
            return 0;
        }else{
            return 1;
        }
    }

    private void conversionToCelsius(){
        System.out.print("Please enter the temperature in Fahrenheit: ");
        double fahrenheitTemperature = input.nextInt();
        System.out.printf("The temperature in Celsius is %.2f", ((fahrenheitTemperature - 32) * 5/9));
    }
    private void conversionToFahrenheit(){
        System.out.print("Please enter the temperature in Celsius: ");
        double celsiusTemperature = input.nextInt();
        System.out.printf("The temperature in Celsius is %.2f", ((celsiusTemperature * 9/5) + 32));
    }

    public static void main(String[] args){
        Solution18 app = new Solution18();
        app.displayOptions();
        String userOption = app.getUserOption();
        int userPath = app.determineOptionPath(userOption);
        if(userPath == 0)
            app.conversionToCelsius();
        else
            app.conversionToFahrenheit();
    }
}
