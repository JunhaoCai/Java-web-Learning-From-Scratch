package Exams.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class LauncherForActorAndAthlete {
    public static void main(String[] args) {
        Person actor = new Actor("小红", 22, "女", "吉林艺术大学", "阿里郎");
        Athlete athlete = new Athlete("小刚", 20, "男", "跳高", "230");
        actor.introduceMyself();
        athlete.introduceMyself();
        System.out.println(actor.toString());
        System.out.println(athlete.toString());
    }
}
