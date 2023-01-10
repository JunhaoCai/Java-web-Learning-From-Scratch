package Homeworks.HomeworkDay08;/*
 *@program:(Study)
 *@author:Mr.Jin
 *@Date:(2023/1/10)
 */

import java.util.Objects;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名。");
        String num = sc.next();
        boolean flag = true;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) >= '0' && num.charAt(i) <= '9'){
               flag = false;
               break;
            }
        }
        if(Objects.nonNull(num) && num.length() > 6 && flag){
            System.out.println("您输入的用户名是" + num + "，您输入正确用户名格式");
        }else {
            System.out.println("您输入了错误的用户名");
        }
    }
}
