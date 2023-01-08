package Exams.Exam01.Exam03;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/8
 */
public class Cat extends Animal{

    @Override
    public void eat(Object obj) {
        ((Fish) obj).beEaten();
    }
}
