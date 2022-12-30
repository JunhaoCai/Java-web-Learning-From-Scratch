package Homeworks.HomeworkDay02;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */

public class DeterminingPrimeNumber {
    public static boolean determinePrimeNumber(int number){
        /**
         * 一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数。
         */
        int counter = 0;
        if (0 < number && number <= 3){
            return true;
        } else if (0 >= number) {
            return false;
        } else{
            for (int i = 1; i <= number; i++) {
                if (number % i == 0){
                    counter++;
                }
            }
            if (counter == 2) {
                return true;
            }else {
                return false;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(determinePrimeNumber(num));
    }
}
