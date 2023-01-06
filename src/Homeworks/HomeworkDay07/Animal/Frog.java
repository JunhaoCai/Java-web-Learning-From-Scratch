package Homeworks.HomeworkDay07.Animal;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Frog extends Animal implements Swim{
    private final String classification = "非哺乳类";

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("青蛙是".concat(classification).concat("，爱吃昆虫"));
    }

    @Override
    public void bark() {
        System.out.println("那只".concat(this.color).concat("的，名叫").concat(this.name).concat("的请外正在呱呱的叫"));
    }

    @Override
    public void Swim() {
        System.out.println("虽然不是鱼，但青蛙也是泳坛高手");
    }
}
