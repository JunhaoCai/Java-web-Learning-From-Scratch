package Exams.Exam01.Exam03;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/8
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Object bone = new Bone();
        dog.eat(bone);

        Cat cat = new Cat();
        Fish fish = new Fish();
        cat.eat(fish);
    }
}
