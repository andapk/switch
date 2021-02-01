package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Task1();
            Task2();
            Task3();
        }
        static void Task1(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter day number from 1 to 7:");
            int dayNumber =input.nextInt();

            switch (dayNumber) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("It's working day");
                case 6:
                case 7:
                    System.out.println("It's holiday");
                default:
                    System.out.println("Please enter valid day number");
            }

        }
        static void Task2(){
            Scanner input2 = new Scanner(System.in);
            System.out.println("Please enter grade: A, B, C, D, E, F.");
            char grade = input2.next().toUpperCase().charAt(0);

            switch (grade){
                case 'A':
                case 'B':
                    System.out.println("Perfect! You are so clever!");
                    break;
                case 'C':
                    System.out.println("Good! But You can do better!");
                    break;
                case 'D':
                case 'E':
                    System.out.println("It is not good! You should study!");
                    break;
                case 'F':
                    System.out.println("Fail! You need to repeat the exam!");
                    break;
                default:
                    System.out.println("Please enter valid grade.");
                    break;
            }

        }
        static void Task3(){

                    Scanner input3 = new Scanner(System.in);
            System.out.println("Please enter value for x");
            double x =input3.nextDouble();
            System.out.println("Please enter value for y");
            double y = input3.nextDouble();
            System.out.println("Please chose your option: "+
                    "a. ‘+’ sum both elements;\n" +
                    "b. ’-’: do subtraction;\n" +
                    "c. ’/’: do dividing;\n" +
                    "d. ‘*’: do multiplication;\n" +
                    "e.  get remainder when the first element is divided by the second element;\n" +
                    "f.  print out both elements;\n" +
                    "g.  verify which element is bigger;\n" +
                    "h.  verify which element is smaller;");
                    char option =input3.next().charAt(0);

                    switch (option){
                        case 'a':
                            System.out.println(x+y);
                            break;
                        case 'b':
                            System.out.println(x-y);
                            break;
                        case 'c':
                            if (y==0){
                                System.out.println("It is not possible to divide with 0");
                            } else {
                                System.out.println(x/y);
                            }
                            break;
                        case 'd':
                            System.out.println(x*y);
                            break;

                        case 'f':
                            System.out.println(x+" and "+y);
                            break;

                        case'g':
                            if (x > y) {
                                System.out.println("The first number x is bigger!");
                            } else if (y > x) {
                                    System.out.println("The second number y is bigger!");
                                } else {
                                    System.out.println("Numbers are equal!");
                                }

                            break;
                        case 'h':
                            if (x < y) {
                                System.out.println("The first number x is bigger!");
                            } else if (y < x) {
                                    System.out.println("The second number y is bigger!");
                                } else {
                                    System.out.println("Numbers are equal!");
                                }

                            break;
                        case 'e':
                            System.out.println(x%y);
                            break;

                    }


        }
}
