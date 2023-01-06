package Homeworks.HomeworkDay07.Animal;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public abstract class Animal {
    protected String name;
    protected String color;

    public abstract void eat();
    public abstract void bark();

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
