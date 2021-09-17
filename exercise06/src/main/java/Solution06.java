import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 06
     *  Copyright 2021 Reynaldo Martinez
     * PseudoCode:
     *  Retirement Calculator
     *   Access current year with built-in time
     *  Ask user for current age and store in 'tempCurrentAge'
     *  Ask user for retirement age and store in 'tempRetirementAge'
     *  Convert string inputs to int data type 'currentAge' and 'retirementAge'
     *  Output the amount of years left till retirement
     */

    private static final Scanner input = new Scanner(System.in);

    private int getAge(){
        System.out.print("What is your current age? ");
        String tempCurrentAge = input.nextLine();
        return Integer.parseInt(tempCurrentAge);
    }

    private int getRetirementAge(){
        System.out.print("At what age would you like to retire? ");
        String tempRetirementAge = input.nextLine();
        return Integer.parseInt(tempRetirementAge);
    }

    private int getCurrentYear(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    private int yearTillRetirement(int retirementAge, int currentAge){
        return retirementAge - currentAge;
    }

    private int retirementYear(int currentYear, int yearsTillRetirement){
        return currentYear + yearsTillRetirement;
    }

    public static void main(String[] args){
        Solution06 app = new Solution06();
        int currentAge = app.getAge();
        int retirementAge = app.getRetirementAge();
        int currentYear = app.getCurrentYear();
        int yearsTillRetirement = app.yearTillRetirement(retirementAge, currentAge);
        int retirementYear = app.retirementYear(currentYear, yearsTillRetirement);

        System.out.printf("You have %d years left until you retire.%nIt's %d, so you can retire in %d",yearsTillRetirement,currentYear, retirementYear);
    }

}

