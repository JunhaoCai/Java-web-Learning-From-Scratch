package Homeworks.HomeworkDay04;

import java.util.Arrays;
import java.util.Random;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class GetMaxAndMinFromArray {
    static int[] ar = new int[50];

    public static void getMaxAndMinAndStatisticalFiguresFromRandomArray(int n){
        Random r = new Random();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int rr = r.nextInt(n);
            ar[i] = rr;
            if (rr >= 60){
                count++;
            }
        }
        System.out.println("大于等于60的数字有：" + count + "个");
        Arrays.sort(ar);
        System.out.println("最小值：" + ar[0]);
        System.out.println("最大值：" + ar[ar.length-1]);
    }

    public static void main(String[] args) {
        getMaxAndMinAndStatisticalFiguresFromRandomArray(100);

    }
}
