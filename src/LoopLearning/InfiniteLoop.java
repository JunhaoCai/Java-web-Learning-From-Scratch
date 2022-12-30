package LoopLearning;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        for (;;){
            System.out.println("hello");
            break;
        }

        while (true){
            System.out.println("hello");
            break;
        }
    }
}
