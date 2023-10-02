import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello !! This a calculator console app");

        Scanner sc  = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("*******************************");
            System.out.println("Select from the options below: ");
            System.out.println("*******************************");
            System.out.println("Press 1: Addition");
            System.out.println("Press 2: Subtraction");
            System.out.println("Press 3: Multiplication");
            System.out.println("Press 4: Division");
            System.out.println("Press 5: Remainder");
            System.out.println("Press 6: Absolute value");
            System.out.println("Press 7: Natural Logarithm");
            System.out.println("Press 8: Exit");

            System.out.print("Enter your choice: ");
            int input = sc.nextInt();
            switch (input){
                case 1:{
                    System.out.print("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2st number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + (num1 + num2));
                    break;

                }case 2:{
                    System.out.print("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2st number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + (num1 - num2));
                    break;

                }case 3:{
                    System.out.print("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2st number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + (num1 * num2));
                    break;

                }case 4:{
                    System.out.print("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2st number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + (num1 / num2));
                    break;

                }case 5:{
                    System.out.print("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2st number: ");
                    int num2 = sc.nextInt();
                    System.out.println("Result: " + (num1 % num2));
                    break;

                }case 6:{
                    System.out.print("Enter the number: ");
                    int num1 = sc.nextInt();
                    System.out.println("Result: " + (Math.abs(num1)));
                    break;

                }case 7:{
                    System.out.print("Enter the number: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Result: " + (Math.log(num1)));
                    break;

                } case 8:{
                    flag = false;
                    break;

                } default:{
                    System.out.print("Enter your choice: ");
                    input = sc.nextInt();
                }
            }
        }

    }
}