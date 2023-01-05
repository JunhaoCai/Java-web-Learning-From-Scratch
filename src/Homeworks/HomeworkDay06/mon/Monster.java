package Homeworks.HomeworkDay06.mon;


/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Monster {
    private String name;
    private Integer bleed;
    private Integer attack;

    public Monster(String name, Integer bleed, Integer attack) {
        this.name = name;
        this.bleed = bleed;
        this.attack = attack;
    }

    protected void move(){
    }
    protected void attack(){
    }

    protected void show(){
        System.out.println("当前声明值：" + this.bleed);
        System.out.println("攻击力是：" + this.attack);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBleed() {
        return bleed;
    }

    public void setBleed(Integer bleed) {
        this.bleed = bleed;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }
}
