package LoopLearning;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class GoToSyntax {
    public static void main(String[] args) {
        a:for (int i = 0; i < 10; i++) {
        b:for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println(i);
                break a;
            }
        }

        }
    }
}
