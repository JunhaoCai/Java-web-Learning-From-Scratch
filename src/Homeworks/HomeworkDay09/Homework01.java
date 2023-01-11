package Homeworks.HomeworkDay09;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/11
 */
public class Homework01  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入分数: ");
            int grade = sc.nextInt();
            if(grade < 0 || grade > 100){
                throw new GradeException("Wrong Input");
            }
            System.out.println("分数为" + grade);
        }catch (GradeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
