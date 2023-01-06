package Homeworks.HomeworkDay07.Animal;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Test {
    public static void main(String[] args) {

        Animal a1 = new Rabbit("美人", "黑色");
        a1.bark();
        a1.eat();
        Frog a2 = new Frog("大兵", "黑色");
        a2.bark();
        a2.eat();
        a2.Swim();

    }
}
