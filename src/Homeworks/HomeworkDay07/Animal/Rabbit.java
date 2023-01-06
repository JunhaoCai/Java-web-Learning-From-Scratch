package Homeworks.HomeworkDay07.Animal;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Rabbit extends Animal{
    private final String classification = "哺乳类";

    public Rabbit(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("兔子是".concat(this.classification).concat("，爱吃胡萝卜"));

    }

    @Override
    public void bark() {
        System.out.println("那只".concat(this.color).concat("的，名叫").concat(this.name).concat("的兔子正在叽叽的叫"));
    }
}
