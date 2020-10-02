package com.company;
import java.util.Scanner;
public class B_Class extends A_Class{
    int y;
//    Saves info about Y
    void InputY(){
        Scanner inputtedVariable = new Scanner(System.in);
        try {
            System.out.print("Input value for Y: ");
            y = inputtedVariable.nextInt();
        }
        catch (Exception e){
            System.out.println("Inputted variable error...");
            InputY();
        }
    }
//    Returns sum from its parent's value of X and its Y
    void ReturnAdditionOfXAndY(){
        System.out.format("Sum of X and Y is: %d\n",x + y);
    }
//    Calls necessary voids
    void CallVoids(){
        InputY();
        ReturnAdditionOfXAndY();
    }
}