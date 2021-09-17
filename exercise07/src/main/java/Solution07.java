import java.util.Scanner;

public class Solution07 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 07
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Area of a Rectangle Room
     *  Restraints: calculations outside output. Constant to hold conversion factor
     *
     *  Pseudo Code:
     *  Declare constant for conversion factor
     *  Ask user for length of room and store 'lengthOfRoom'
     *  Ask use for width of room and store 'widthOfRoom'
     *  Calculate width and store in 'areaOfRoom'
     *  Output in square feet and square meters
     */
    public static final double CONVERSION = 0.09290304;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lengthOfRoom = new Solution07().getLength(input);
        int widthOfRoom = new Solution07().getWidth(input);
        int metricAreaOfRoom = new Solution07().getMetricArea(lengthOfRoom, widthOfRoom);
        double imperialAreaOfRoom = new Solution07().getImperialArea(metricAreaOfRoom);

        System.out.printf("You entered dimensions of %d feet by %d feet.%nThe area is%n%d square feet%n%.3f square meters",lengthOfRoom,widthOfRoom,metricAreaOfRoom,imperialAreaOfRoom);
    }

    public int getLength(Scanner input){
        System.out.print("What is the length of the room in feet? ");
        return input.nextInt();
    }

    public int getWidth(Scanner input){
        System.out.print("What is the width of the room in feet? ");
        return input.nextInt();
    }

    public int getMetricArea(int lengthOfRoom, int widthOfRoom){
        return lengthOfRoom * widthOfRoom;
    }

    public double getImperialArea(int metricArea){
        return metricArea * CONVERSION;
    }
}
