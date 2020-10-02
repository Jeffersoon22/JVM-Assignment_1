package com.company;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.out.println("\n----------\nდავალება N1\n----------\n");
        C_Class classC = new C_Class();
        classC.CallVoids();
        System.out.println("\n----------\nდავალება N2\n----------\n");
        A_Class classA = new A_Class();
        classA.CallVoids();
        B_Class classB = new B_Class();
        classB.CallVoids();
        System.out.println("\n----------\nდავალება N3\n----------\n");
        Third_Task thirdTask = new Third_Task();
        thirdTask.CallVoids();
        TimeUnit.SECONDS.sleep(5);
        System.out.println("\n----------\nFinished!\n----------\n");
    }
}
