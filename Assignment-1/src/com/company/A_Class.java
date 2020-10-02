package com.company;
import java.util.Scanner;
public class A_Class {
    static int x;
//    Constructor which prints "Hello"
    public A_Class(){
        System.out.println("Hello");
    }
//    Saves info about X
    void InputX(){
        Scanner inputtedVariable = new Scanner(System.in);
        try {
            System.out.print("Input value for X: ");
            x = inputtedVariable.nextInt();
        }
        catch (Exception e){
            System.out.println("Inputted variable error...");
            InputX();
        }
    }
//    Voids append X to 12
    void PrintXAddTwelve(){
        System.out.format("X + 12 = %d",x + 12).print("\n");
    }
    void IsXEvenOrOdd(){
        String result = x % 2 == 0 ? "Even" : "Odd";
        System.out.format("X is %s\n",result);
    }
//    Calls necessary voids
    void CallVoids(){
        InputX();
        PrintXAddTwelve();
        IsXEvenOrOdd();
    }
}
