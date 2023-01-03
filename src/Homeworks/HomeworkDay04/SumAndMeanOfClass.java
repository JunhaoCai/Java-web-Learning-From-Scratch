package Homeworks.HomeworkDay04;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class SumAndMeanOfClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] students = new int[3][10];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                int grade = input.nextInt();
                students[i][j] = grade;
            }
        }
        int count = 0;
        int sum = 0;
        for (int[] student : students) {
            for (int grade : student) {
                count++;
                System.out.println(grade);
                sum += grade;
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("mean: " + sum / count);

    }
}
