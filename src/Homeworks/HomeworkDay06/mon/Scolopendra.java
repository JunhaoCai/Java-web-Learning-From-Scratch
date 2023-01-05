package Homeworks.HomeworkDay06.mon;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Scolopendra extends Monster {
    public Scolopendra(String name, Integer bleed, Integer attack) {
        super(name, bleed, attack);
    }

    @Override
    protected void move() {
        System.out.println("我是".concat(this.getName()).concat("，御剑飞行"));
    }

    @Override
    protected void attack() {
        System.out.println("怪物蜈蚣乙展开攻击");
    }
}
