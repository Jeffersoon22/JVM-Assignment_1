package com.company;
import java.util.Scanner;
public class Third_Task {
    int[] listOfRandomNumbers = new int[40];
    int startPoint,endPoint;
    int sumOfOdds = 0,sumOfEvens = 0;
    int[] fiveRandomBetweenSum = new int[5];
//    Saves two number for interval for random
    void InputTwoNumber(){
        Scanner inputtedVariable = new Scanner(System.in);
        try {
            System.out.print("Input first number: ");
            startPoint = inputtedVariable.nextInt();
            System.out.format("Input second number: ");
            endPoint = inputtedVariable.nextInt();
            GetValuesWithRandomAndPrint(listOfRandomNumbers,listOfRandomNumbers.length,startPoint, endPoint);
        }
        catch (Exception e){
            System.out.println("Inputted variable error...");
            InputTwoNumber();
        }
    }
//    Generates numbers for array with random
    void GetValuesWithRandomAndPrint(int[] someArray,int arrayLength,int start,int end){
        if (end > start){
            System.out.format("Interval is [ %d ; %d ]",start,end);
            for(int i=0;i<arrayLength;i++){
                int randomNumber = (int) (Math.random() * (end - start +1 )) + start;
                someArray[i] = randomNumber;
            }
        }
        else {
            System.out.format("Interval is [ %d ; %d ]",end,start);
            for(int i=0;i<arrayLength;i++){
                int randomNumber = (int) (Math.random() * (start - end +1 )) + end;
                someArray[i] = randomNumber;
            }
        }
        System.out.print("\nList of random numbers between interval:\t");
        for (int number: someArray
             ) {
            System.out.print(number + "\t");
        }
    }
//    Counts odds and even numbers in array
    void HowManyOddsAndEvens(){
        int counter = 0;
        for (int number: listOfRandomNumbers
             ) {
            if (number % 2 == 1) counter++;
        }
        System.out.format("\nQuantity of odds is: %d\n",counter);
        System.out.format("Quantity of evens is: %d\n",listOfRandomNumbers.length - counter);
    }
//    Summarizes odds and evens
    void SumOfOddsAndEvens(){
        for (int number:listOfRandomNumbers
             ) {
            if (number % 2 == 1) sumOfOdds += number;
            else sumOfEvens += number;
        }
        System.out.format("Sum of odds: %d\n",sumOfOdds);
        System.out.format("Sum of evens: %d\n",sumOfEvens);
    }
//    Returns random numbers between sum of odds and sum of evens
    void RandomNumbersBetweenSums(){
        GetValuesWithRandomAndPrint(fiveRandomBetweenSum,fiveRandomBetweenSum.length,sumOfEvens,sumOfOdds);
    }
//    Calls necessary voids
    void CallVoids(){
        InputTwoNumber();
        HowManyOddsAndEvens();
        SumOfOddsAndEvens();
        RandomNumbersBetweenSums();

    }
}