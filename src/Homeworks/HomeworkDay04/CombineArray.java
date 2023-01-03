package Homeworks.HomeworkDay04;

import java.lang.reflect.Array;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class CombineArray {
    public static void main(String[] args) {
        int []oldArr = {
                1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5
        };
        int adjustingLength = 0;


        for (int i : oldArr) {
            if (i != 0){
                adjustingLength++;
            }
        }
        int [] newArr = new int[adjustingLength];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0){
                newArr[j] = oldArr[i];
                j++;
            }
        }
        for (int i : newArr) {
            System.out.println(i);
        }
    }
}
