import java.util.Scanner;

public class Solution10 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Self-Checkout
     *  Constraints: Input, processing, output separate & convert string to numerical
     *
     *  PseudoCode:
     *  Ask for the price of three separate items 'tempItemOne' 'tempItemTwo' 'tempItemThree'
     *  Ask for the quantity of three separate items 'tempAmtItemOne' 'tempAmtItemTwo' 'tempAmtItemTwo'
     *  Convert all string data to int
     *  Calculate the price of each item and their quantity and store in 'subTotalPrice'
     *  calculate the tax and store in 'tax'
     *  calculate the total 'totalPrice'
     */
    private static final Scanner input = new Scanner(System.in);
    public static final double TAX = 0.055;

    private int getItemOne(){
        System.out.print("Enter the price of item 1: ");
        String tempItemOne = Solution10.input.nextLine();
        int itemOne = Integer.parseInt(tempItemOne);
        System.out.print("Enter the quantity of item 1: ");
        String tempAmtItemOne = Solution10.input.nextLine();
        int amtItemOne = Integer.parseInt(tempAmtItemOne);

        return itemOne * amtItemOne;
    }

    private int getItemTwo(){
        System.out.print("Enter the price of item 2: ");
        String tempItemTwo = Solution10.input.nextLine();
        int itemTwo = Integer.parseInt(tempItemTwo);
        System.out.print("Enter the quantity of item 2: ");
        String tempAmtItemTwo = Solution10.input.nextLine();
        int amtItemTwo = Integer.parseInt(tempAmtItemTwo);

        return itemTwo * amtItemTwo;
    }

    private int getItemThree(){
        System.out.print("Enter the price of item 3: ");
        String tempItemThree = Solution10.input.nextLine();
        int itemThree = Integer.parseInt(tempItemThree);
        System.out.print("Enter the quantity of item 3: ");
        String tempAmtItemThree = Solution10.input.nextLine();
        int amtItemThree = Integer.parseInt(tempAmtItemThree);

        return itemThree * amtItemThree;
    }

    private double calculateSubTotal(int totalOfItemOne, int totalOfItemTwo, int totalOfItemThree){
        return (totalOfItemOne + totalOfItemTwo + totalOfItemThree);
    }

    private double calculateTax(double subTotal){
        return subTotal * TAX;
    }

    public double calculateTotal(double subTotal, double totalTax){
        return subTotal + totalTax;
    }

    public static void main(String[] args){
        Solution10 app = new Solution10();
        int totalOfItemOne = app.getItemOne();
        int totalOfItemTwo = app.getItemTwo();
        int totalOfItemThree = app.getItemThree();

        double subTotalPrice = app.calculateSubTotal(totalOfItemOne,totalOfItemTwo,totalOfItemThree);
        double totalTax = app.calculateTax(subTotalPrice);
        double totalPrice = app.calculateTotal(subTotalPrice, totalTax);

        System.out.printf("Subtotal: %.2f%nTax: %.2f%nTotal: %.2f", subTotalPrice, totalTax, totalPrice);
    }

}
