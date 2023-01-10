package Homeworks.HomeworkDay08;/*
 *@program:(Study)
 *@author:Mr.Jin
 *@Date:(2023/1/10)
 */

import java.util.Calendar;

public class Homework03 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990,3,3);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)+"天");
        calendar.add(Calendar.DAY_OF_YEAR,35);
        System.out.print(calendar.get(Calendar.DAY_OF_YEAR)+"天");
    }
}
