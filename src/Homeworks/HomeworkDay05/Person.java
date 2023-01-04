package Homeworks.HomeworkDay05;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/4
 */
public class Person {
    private String name;
    private Double age;

    public Person(String name, Double age) {
        this.name = name;
        this.age = age;
    }


    public String display() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Osmond", 22.5);
        System.out.println(person.display());
    }
}
