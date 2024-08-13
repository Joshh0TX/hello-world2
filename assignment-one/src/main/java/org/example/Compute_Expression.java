package org.example;

public class Compute_Expression {
    public static void main(String[] args){
        //We start by initializing variables and assigning them
        float a = 9.5f;
        float b = 4.5f;
        float c = 45.5f;
        float d = 3.5f;
        float x = 2.5f;
        int y = 3;
        //We find the result
        float result1 = (a * b) - (x * y);
        float result2 = (c - d);

        //This program displays the result of the equation below.

        System.out.println("Find the solution of the equation below");
        System.out.println("9.5 * 4.5 - 2.5 * 3");
        System.out.println("--------------------");
        System.out.println("    45.5 - 3.5");

        System.out.println(" ");  //this line shows whitespace
        System.out.println("SOLUTION");

        System.out.println("The final answer is: " + result1 / result2); //This line prints the final answer
    }
}
