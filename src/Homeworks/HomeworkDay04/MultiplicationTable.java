package Homeworks.HomeworkDay04;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "" + "\t");
            }
            System.out.println();
        }
    }
}
