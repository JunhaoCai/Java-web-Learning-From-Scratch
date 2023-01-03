package Homeworks.HomeworkDay04;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class DoubleLoop {
    public static void main(String[] args) {
        int [][]b = {
                {11},
                {21, 22},
                {31, 32, 33}
        };
        int sum = 0;
        for (int[] ints : b) {
            for (int anInt : ints) {
                sum+=anInt;
            }
        }
        System.out.println(sum);
    }
}
