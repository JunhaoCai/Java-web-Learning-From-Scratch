package Homeworks.HomeworkDay02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class CreateRandomNumbers {
    public static void main(String[] args) {
        int counter = 0;
        while (true) {
            int random = (int)(Math.random() * 101);
            counter++;
            if (random == 88){
                System.out.println(random);
                System.out.println("counter: " + counter);
                break;
            }
        }
    }
}
