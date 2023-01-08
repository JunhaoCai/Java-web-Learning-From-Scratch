package Exams.Exam01.Exam01;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/8
 */
public class Telephone {
    public static void main(String[] args) {
        System.out.println("请输入电话号码：");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int [] nums = new int[num.length()];
        if (num.length() == 11){
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 1){
                    nums[i] =  Integer.parseInt(String.valueOf(num.charAt(i))) + 8;
                    if (nums[i] / 10 %10 != 0) {
                        nums[i] = nums[i] % 10;
                    }
                }
                else {
                    nums[i] =  Integer.parseInt(String.valueOf(num.charAt(i)));
                }

            }
            for (int i : nums) {
                System.out.print(i);
            }
        }
        if (num.length() == 8){
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0){
                    nums[i] =  Integer.parseInt(String.valueOf(num.charAt(i))) + 5;
                    if (nums[i] / 10 %10 != 0) {
                        nums[i] = nums[i] % 10;
                    }

                }
                else {
                    nums[i] =  Integer.parseInt(String.valueOf(num.charAt(i)));

                }
            }
            for (int i : nums) {
                System.out.print(i);
            }
        }
        else {
            System.out.println("输入有误");
        }
    }
}

