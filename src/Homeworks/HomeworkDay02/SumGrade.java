package Homeworks.HomeworkDay02;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class SumGrade {
    public static double getSumGrade(double[] grades){
        double sum = 0;
        for (double grade:
             grades) {
            sum += grade;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextDouble();
        }
        System.out.println("总分："+getSumGrade(grades));
    }
}

