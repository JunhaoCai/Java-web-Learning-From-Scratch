package Homeworks.HomeworkDay01;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/28
 */
public class Circle {
    public static double circumference(double r){
        double c = 2 * Math.PI * r;
        return c;
    }

    public static double areaOfCircle(double r) {
        double a = Math.PI * Math.pow(r, 2);
        return a;
    }

    public static void main(String[] args) {
        System.out.print("请输入圆的半径：");
        Scanner scR = new Scanner(System.in);
        double r = scR.nextDouble();
        System.out.println("圆的半径为：R = " + r);
        System.out.println("该圆的周长为：C = " + circumference(r));
        System.out.println("该圆的面积为：S = " + areaOfCircle(r));

    }
}
