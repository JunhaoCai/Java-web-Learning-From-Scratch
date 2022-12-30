package Homeworks.HomeworkDay01;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/28
 */

public class Encryption {
    public static int digitalEncryption(int num) {
        int thousandsDigital = (num / 1000 + 5) % 10;
        int hundredsDigital = (num % 1000 / 100 + 5) % 10;
        int tensDigital = (num % 100 / 10 + 5) % 10;
        int singleDigital = (num % 10 + 5) % 10;
        int finalNumbers = singleDigital * 1000 + thousandsDigital + hundredsDigital * 10 + tensDigital * 100;

        return finalNumbers;
    }

    public static void main(String[] args) {
        System.out.print("请输入一个4位正整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("加密后的数字为：" + digitalEncryption(num));

    }
}
