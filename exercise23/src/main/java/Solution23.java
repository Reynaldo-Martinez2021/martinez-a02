import java.util.Scanner;

import static java.lang.System.exit;

public class Solution23 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
     *  Copyright 2021 Reynaldo Martinez
     *
     *  Problem: Trouble shooting car issues
     *  Constraints: Ask only relevant to the situation and to the previous answers. Don't ask for all inputs
     *
     *  PseudoCode:
     *  Follow the startuml that's the pseudocode
     *
     */
    private static final Scanner input = new Scanner(System.in);

    private void carIssues(){
        System.out.print("Is the car silent when you turn the key? ");
        if(Solution23.input.nextLine().equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            if(Solution23.input.nextLine().equals("y")){
                System.out.print("Clean terminals and try starting again");
                return;
            }else{
                System.out.print("Replace cables and try again. ");
            }
            return;
        }
    }

    private void carIssuesPartTwo(){
        System.out.print("Does the car make a slicking noise? ");
        if(Solution23.input.next().equals("y")){
            System.out.print("Replace the battery.");
        }else{
            System.out.print("Does the car crank up but fail to start? ");
            input.nextLine();
            if(Solution23.input.nextLine().equals("y")){
                System.out.print("Check spark plug connections.");
            }else{
                System.out.print("Does the car engine start and then die? ");
                if(Solution23.input.nextLine().equals("y")){
                    System.out.print("Does your car have fuel injection? ");
                    if(Solution23.input.nextLine().equals("y")){
                        System.out.print("Get it in for service.");
                    }else{
                        System.out.print("Check to ensure the choke is opening and closing.");
                    }
                }else{
                    System.out.print("This should not be possible.");
                    return;
                }
            }
        }
    }

    public static void main(String[] args){
        Solution23 app = new Solution23();
        app.carIssues();
        app.carIssuesPartTwo();
    }
}
