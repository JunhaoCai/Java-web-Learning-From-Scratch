package Homeworks.HomeworkDay09;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/11
 */
public class Homework02{
    public static void main(String[] args) {
        System.out.println("Input three sides of the triangle.");
        Scanner sc = new Scanner(System.in);
        int firstSide = sc.nextInt();
        int secondSide = sc.nextInt();
        int thirdSide = sc.nextInt();
        isTriangle(firstSide, secondSide, thirdSide);
    }
    public static void isTriangle(int firstSide, int secondSide, int thirdSide) {
        try {
            if(firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide){
                System.out.println("firstSide = "+firstSide+",secondSide = "+secondSide+",thirdSide = "+thirdSide);
            }else {
                throw new IllegalArgumentException("Sorry! ");
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
