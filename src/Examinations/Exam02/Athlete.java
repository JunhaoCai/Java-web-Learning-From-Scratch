package Exams.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Athlete extends Person {

    String sportItem;
    String gradeOfHistory;

    public Athlete(String name, Integer age, String gender, String sportItem, String gradeOfHistory) {
        super(name, age, gender);
        this.sportItem = sportItem;
        this.gradeOfHistory = gradeOfHistory;
    }



    @Override
    public void introduceMyself() {
        System.out.println("我是运动员");
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "sportItem='" + sportItem + '\'' +
                ", gradeOfHistory='" + gradeOfHistory + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
