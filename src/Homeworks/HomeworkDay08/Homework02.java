package Homeworks.HomeworkDay08;/*
 *@program:(Study)
 *@author:Mr.Jin
 *@Date:(2023/1/10)
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄: ");
        String ages = sc.next();
        System.out.println("请输入分数: ");
        String scores = sc.next();
        System.out.println("请输入入学时间: ");
        String studyTimes = sc.next();
        int age = 0;
        age = Integer.parseInt(ages);
        double score = 0;
        score = Double.parseDouble(scores);
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        date = dateFormat.parse(studyTimes);
        System.out.println("年龄"+age+"分数: "+score+"时间: "+date);

    }
}
