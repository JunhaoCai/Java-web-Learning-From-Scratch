package Homeworks.HomeworkDay02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class SumTerms {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;

            }
        }
        System.out.println(sum);
    }
}
