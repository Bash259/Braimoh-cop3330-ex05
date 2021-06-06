/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */



import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner UserInput = new Scanner(System.in);
        String FirstIn = UserInput.nextLine();
        int firstInt = Integer.parseInt(FirstIn);
        System.out.println("What is the second number?");
        String SecondIn = UserInput.nextLine();
        int secondInt = Integer.parseInt(SecondIn);

        double Add = firstInt + secondInt;
        double subtract = firstInt - secondInt;
        double multiply = firstInt * secondInt;
        double divide = firstInt/secondInt;

        System.out.println(firstInt + " + " + secondInt +" = "+ Add+"\n"+ firstInt + " - " + secondInt +" = "+ subtract+"\n"
                + firstInt + " * " + secondInt +" = "+multiply+"\n" +firstInt + " / " + secondInt +" = "+ divide);
    }
}
