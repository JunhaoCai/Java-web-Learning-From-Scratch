package Homeworks.HomeworkDay04;

import com.sun.source.tree.Tree;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class DeterminingPrimeNumbers {
    public static boolean determinePrimeNumber(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (determinePrimeNumber(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
