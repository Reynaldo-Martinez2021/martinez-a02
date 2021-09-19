import java.util.Scanner;

public class Solution19 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: BMI Calculator
     *  Constraints: program only takes numeric data. Don't let user continue unless the data is valid
     *
     *  PseudoCode:
     *  Ask user for weight 'userWeight' and user height 'userHeight'
     *  BMI = (userWeight/ (userHeight * userHeight)) * 703
     *  Create a method to only take in numeric data
     *      method should allow user to continue entering data until numeric appear
     *  Calculate the BMI and if bmi between 18.5 and 25 that person is at normal
     */

    private static final Scanner input = new Scanner(System.in);

    private double getHeight(){
        while(true){
            try{
               System.out.print("Enter your height in inches: ");
               return Double.parseDouble(input.nextLine());
            }catch(NumberFormatException e){
                System.out.printf("Please enter numeric data only%n");
            }
        }
    }

    private double getWeight(){
        while(true){
            try{
                System.out.print("Enter your weight in pounds: ");
                return Double.parseDouble(input.nextLine());
            }catch(NumberFormatException e){
                System.out.printf("Please enter numeric data only%n");
            }
        }
    }

    private double calculateBMI(double userHeight, double userWeight){
        return (userWeight / (userHeight * userHeight))* 703;
    }

    private void printOutput(double userBMI){
        if(userBMI > 25.0){
            System.out.printf("Your BMI is %.1f.%nYou are overweight. You should see a doctor.", userBMI);
        }else if(userBMI < 18.5){
            System.out.printf("Your BMI is %.1f.%nYou are underweight. You should see a doctor.", userBMI);
        }else{
            System.out.printf("Your BMI is %.1f.%nYou are within ideal weight range.", userBMI);
        }
    }

    public static void main(String[] args){
        Solution19 app = new Solution19();
        double userHeight = app.getHeight();
        double userWeight = app.getWeight();
        double userBMI = app.calculateBMI(userHeight, userWeight);
        app.printOutput(userBMI);
    }
}
