package LoopLearning;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to use my Calculator");
        System.out.println("Input first Number, Please.");
        double num1 = sc.nextDouble();
        System.out.println("Input second Number, Please.");
        double num2 = sc.nextDouble();

        int count = 0;
        do {
            System.out.println("Input a symbol that you want");
            String symbol = sc.next();
            switch (symbol) {
                case "+" :
                    System.out.println(num1 + num2);
                    count--;
                    break;

                case "-" :
                    System.out.println(num1 - num2);
                    count--;
                    break;

                case "*" :
                    System.out.println(num1 * num2);
                    count--;
                    break;

                case "/" :
                    if (num2 == 0){
                        System.out.println("The divisor can not be 0.");
                        break;
                    }
                    System.out.println(num1 / num2);
                    count--;
                    break;

                default :
                    System.out.println("Invalid symbol.");
                    System.out.println("I wanna give you chance again.");
                    count++;
                    break;
            }
        }while (count <= 2 && count > 0);
    }
}

