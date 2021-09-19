import java.util.Scanner;

public class Solution08 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 08
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Pizza Party
     *
     *  PseudoCode:
     *  Ask user for how people store in 'amtOfPeople'
     *  Ask user for how many pizzas 'amtOfPizzas'
     *  Ask user for how many slices per pizza 'slicesPerPizza'
     *  Calculate how many slices in total there are 'totalSlices'
     *  use modulo to calculate remainder 'remainingPizza'
     */
    private static final Scanner input = new Scanner(System.in);

    private int getPeople(){
        System.out.print("How many people? ");
        return input.nextInt();
    }

    private int getPizzas(){
        System.out.print("How many pizzas do you have? ");
        return input.nextInt();
    }

    private int getSlices(){
        System.out.print("How many slices per pizza? ");
        return input.nextInt();
    }

    public static void main(String[] args){
        Solution08 app = new Solution08();
        int amtOfPeople = app.getPeople();
        int amtOfPizzas = app.getPizzas();
        int slicesPerPizza = app.getSlices();

        System.out.printf("%d people with %d pizzas (%d slices).%nEach person gets %d pieces of pizza.%nThere are %d leftover pieces.",
                amtOfPeople,amtOfPizzas,(amtOfPizzas*slicesPerPizza), ((amtOfPizzas*slicesPerPizza)/amtOfPeople), ((amtOfPizzas*slicesPerPizza)%amtOfPeople));
    }

}
