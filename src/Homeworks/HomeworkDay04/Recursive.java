package Homeworks.HomeworkDay04;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class Recursive {
    public static int recursivePracticing(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return recursivePracticing(n - 2) + recursivePracticing(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursivePracticing(3));
    }
}
