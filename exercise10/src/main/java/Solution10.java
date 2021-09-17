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

    public static final double TAX = 0.055;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int totalOfItemOne = new Solution10().getItemOne(input);
        int totalOfItemTwo = new Solution10().getItemTwo(input);
        int totalOfItemThree = new Solution10().getItemThree(input);

        double subTotalPrice = new Solution10().calculateSubTotal(totalOfItemOne,totalOfItemTwo,totalOfItemThree);
        double totalTax = new Solution10().calculateTax(subTotalPrice);
        double totalPrice = new Solution10().calculateTotal(subTotalPrice, totalTax);

        System.out.printf("Subtotal: %.2f%nTax: %.2f%nTotal: %.2f", subTotalPrice, totalTax, totalPrice);
    }

    public int getItemOne(Scanner input){
        System.out.print("Enter the price of item 1: ");
        String tempItemOne = input.nextLine();
        int itemOne = Integer.parseInt(tempItemOne);
        System.out.print("Enter the quantity of item 1: ");
        String tempAmtItemOne = input.nextLine();
        int amtItemOne = Integer.parseInt(tempAmtItemOne);

        return itemOne * amtItemOne;
    }

    public int getItemTwo(Scanner input){
        System.out.print("Enter the price of item 2: ");
        String tempItemTwo = input.nextLine();
        int itemTwo = Integer.parseInt(tempItemTwo);
        System.out.print("Enter the quantity of item 2: ");
        String tempAmtItemTwo = input.nextLine();
        int amtItemTwo = Integer.parseInt(tempAmtItemTwo);

        return itemTwo * amtItemTwo;
    }

    public int getItemThree(Scanner input){
        System.out.print("Enter the price of item 3: ");
        String tempItemThree = input.nextLine();
        int itemThree = Integer.parseInt(tempItemThree);
        System.out.print("Enter the quantity of item 3: ");
        String tempAmtItemThree = input.nextLine();
        int amtItemThree = Integer.parseInt(tempAmtItemThree);

        return itemThree * amtItemThree;
    }

    public double calculateSubTotal(int totalOfItemOne, int totalOfItemTwo, int totalOfItemThree){
        return (totalOfItemOne + totalOfItemTwo + totalOfItemThree);
    }

    public double calculateTax(double subTotal){
        return subTotal * TAX;
    }

    public double calculateTotal(double subTotal, double totalTax){
        return subTotal + totalTax;
    }
}
