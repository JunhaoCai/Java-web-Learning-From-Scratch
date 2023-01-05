package Homeworks.HomeworkDay06.mon;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class TestMonsters {
    public static void main(String[] args) {
        Snake snake = new Snake("蛇怪", 5, 20);
        snake.attack();
        snake.show();
        snake.addBlood();
        snake.move();
        System.out.println("====================");

        Scolopendra scolopendra = new Scolopendra("蜈蚣精", 60, 15);
        scolopendra.attack();
        scolopendra.show();
        scolopendra.move();
    }
}
