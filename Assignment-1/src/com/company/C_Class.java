package com.company;
import java.util.Scanner;
public class C_Class {
    int a, b, c;
//    saves information about a b and c
    void GetValues(){
        Scanner inputtedValue = new Scanner(System.in);
        try {
            System.out.print("Input value for a: ");
            a = inputtedValue.nextInt();
            System.out.print("Input value for b: ");
            b = inputtedValue.nextInt();
            System.out.print("Input value for c: ");
            c = inputtedValue.nextInt();
        }
        catch (Exception e){
            System.out.println("Inputted variable error...");
            GetValues();
        }
    }
//    returns last digit of a
    int GetLastOfa(){
        return  a % 10;
    }
//    returns first digit of b
    int GetFirstOfb(){
        while(b >10){
            b/=10;
        }
        return b;
    }
//    returns sum of digits of c
    int SumOfC(){
        int sum = 0;
        while(c!=0){
            sum+=c%10;
            c/=10;
        }
        return sum;
    }
//    returns multiplied of first digit of b and last digit of a
    int MultiplyOfFirsOfAAndLastOfB(){
        int lastOfA = GetLastOfa();
        int firstOfB = GetFirstOfb();
//        ვაკომენტარებ ამ ხაზს იმიტომ რომ აუთფუთი არ მინდა სამომავლოდ იყოს უშნო...
//        System.out.format("The result of last number of a and first number of b multiplication is : %d\n",lastOfA*firstOfB);
        return lastOfA * firstOfB;
    }
//    returns sum of multiplied of first digit of b and last digit of a and first digit of b
    int MultiplyOfSumCAndFirstLast(){
        int firstOfB = GetFirstOfb();
        int multiplyFirstAndLastVoids = MultiplyOfFirsOfAAndLastOfB();
//        ვაკომენტარებ ამ ხაზს იმიტომ რომ აუთფუთი არ მინდა სამომავლოდ იყოს უშნო...
//        System.out.format("The result of first number of b and fifth void result addition is : %d\n",firstOfB*multiplyFirstAndLastVoids);
        return firstOfB + multiplyFirstAndLastVoids;
    }
//    calls all necessary voids
    void CallVoids(){
        GetValues();
        GetLastOfa();
        GetFirstOfb();
        SumOfC();
        System.out.format("The result of last number of a and first number of b multiplication is : %d\n",MultiplyOfFirsOfAAndLastOfB());
        System.out.format("The result of first number of b and fifth void result sum is : %d\n",MultiplyOfSumCAndFirstLast());

    }
}