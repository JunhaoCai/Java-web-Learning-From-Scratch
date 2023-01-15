package Exams.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public abstract class Person {
    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String name;
    Integer age;
    String gender;

    public abstract void introduceMyself();
}
