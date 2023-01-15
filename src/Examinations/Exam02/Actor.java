package Exams.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Actor extends Person {
    String graduateSchool;
    String production;

    public Actor(String name, Integer age, String gender, String graduateSchool, String production) {
        super(name, age, gender);
        this.graduateSchool = graduateSchool;
        this.production = production;
    }

    @Override
    public void introduceMyself() {
        System.out.println("我是演员");
    }

    @Override
    public String toString() {
        return "Actor{" +
                "graduateSchool='" + graduateSchool + '\'' +
                ", production='" + production + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
