package Homeworks.HomeworkDay07.Idol;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Idol implements IsInTheMovie, InTheTVPlay, Sing{
    private String name;

    public Idol(String name) {
        this.name = name;
    }

    @Override
    public void inTheTvPlay() {
        System.out.println("我能演电视剧");
    }

    @Override
    public void isInTheMovie() {
        System.out.println("我能演电影");
    }

    @Override
    public void sing() {
        System.out.println("我会唱歌");

    }
    public void show(){
        System.out.println("大家好！我是" + this.name);
        inTheTvPlay();
        isInTheMovie();
        sing();
    }
}
