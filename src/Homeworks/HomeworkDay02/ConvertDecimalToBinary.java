package Homeworks.HomeworkDay02;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class ConvertDecimalToBinary {
    static int binary = 0;
    static String Binary = "";

    public static int decimalToBinary(int decimal) {
        if (decimal / 2 == 0){
            Binary = Binary + 1;
            return 1;
        }else {
            binary = decimal % 2;
            decimal = decimal / 2;
            Binary = Binary + binary;
            return decimal + decimalToBinary(decimal);
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入一个10进制数字：");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        decimalToBinary(decimal);
//        System.out.println(Binary);
        String binaryReverse = new StringBuilder(Binary).reverse().toString();
        System.out.println("你输入的数字为" + decimal + "转换为2进制的数字为" + binaryReverse);
    }
}
