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
    private static final Scanner input = new Scanner(System.in);
    private static final double CONVERSION = 0.09290304;

    private int getLength(){
        System.out.print("What is the length of the room in feet? ");
        return input.nextInt();
    }

    private int getWidth(){
        System.out.print("What is the width of the room in feet? ");
        return input.nextInt();
    }

    private int getMetricArea(int lengthOfRoom, int widthOfRoom){
        return lengthOfRoom * widthOfRoom;
    }

    private double getImperialArea(int metricArea){
        return metricArea * CONVERSION;
    }

    public static void main(String[] args){
        Solution07 app = new Solution07();
        int lengthOfRoom = app.getLength();
        int widthOfRoom = app.getWidth();
        int metricAreaOfRoom = app.getMetricArea(lengthOfRoom, widthOfRoom);
        double imperialAreaOfRoom = app.getImperialArea(metricAreaOfRoom);

        System.out.printf("You entered dimensions of %d feet by %d feet.%nThe area is%n%d square feet%n%.3f square meters",lengthOfRoom,widthOfRoom,metricAreaOfRoom,imperialAreaOfRoom);
    }

}
