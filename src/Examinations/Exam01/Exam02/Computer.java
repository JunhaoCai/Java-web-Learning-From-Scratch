package Exams.Exam01.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/8
 */
public class Computer extends Product implements PlayGame {
    @Override
    public void storeMemory() {
        System.out.println("电脑已存储数据！");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}
