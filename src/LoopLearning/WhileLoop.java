package LoopLearning;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j > 10);
    }
}
