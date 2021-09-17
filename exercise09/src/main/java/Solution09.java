import java.util.Scanner;

public class Solution09 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 09
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Paint Calculator
     *  Constraints: Use constant to hold conversion rate, always round up to whole number
     *
     *  PseudoCode:
     *  Constant will hold conversion rate (1 gal equals 360 feet)
     *  Prompt the length and width of room 'lengthOfRoom' 'widthOfRoom'
     *  Calculate the square ft of room and determine amtOfPaint needed
     *  Always round up for gallons of paint
     */
    public static final double MAX_AREA_OF_GALLON = 350;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lengthOfRoom = new Solution09().getLength(input);
        int widthOfRoom = new Solution09().getWidth(input);
        int amtOfPaint = new Solution09().calculatePaint((lengthOfRoom*widthOfRoom));
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", amtOfPaint, (lengthOfRoom*widthOfRoom));
    }

    public int getLength(Scanner input){
        System.out.print("What is the length of the room in feet? ");
        return input.nextInt();
    }

    public int getWidth(Scanner input){
        System.out.print("What is the width of the room in feet? ");
        return input.nextInt();
    }

    public int calculatePaint(int areaOfRoom){
        return (int)Math.ceil(areaOfRoom/MAX_AREA_OF_GALLON);
    }
}
