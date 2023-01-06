package Homeworks.HomeworkDay07.Music;

import Homeworks.HomeworkDay07.Music.Instrument;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Violin extends Instrument {
    @Override
    protected void makeSound() {
        System.out.println("小提琴声");
    }
}
