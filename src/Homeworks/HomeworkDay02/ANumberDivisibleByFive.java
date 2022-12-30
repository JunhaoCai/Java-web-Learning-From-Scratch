package Homeworks.HomeworkDay02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class ANumberDivisibleByFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000 ; i++) {
            if (i % 5 == 0){
                System.out.print(i + "\t");
                if (i % 3 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("===============");
        int j = 1;
        while (j <= 1000){
            if (j % 5 == 0){
                System.out.print(j + "\t");
                if (j % 3 == 0){
                    System.out.println();
                }
            }
            j++;
        }
    }
}
