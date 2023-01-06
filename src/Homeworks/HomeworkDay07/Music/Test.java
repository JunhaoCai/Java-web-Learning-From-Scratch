package Homeworks.HomeworkDay07.Music;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Test {
    public static void main(String[] args) {
        Musician musician = new Musician();
        Instrument erhu = new Erhu();
        Piano piano = new Piano();
        Violin violin = new Violin();
        musician.play(erhu);
        musician.play(piano);
        musician.play(violin);
    }
}
