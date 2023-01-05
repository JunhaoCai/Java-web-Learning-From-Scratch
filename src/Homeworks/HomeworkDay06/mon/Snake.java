package Homeworks.HomeworkDay06.mon;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Snake extends Monster{
    public Snake(String name, Integer bleed, Integer attack) {
        super(name, bleed, attack);
    }

    @Override
    protected void move() {
        System.out.println("我是".concat(this.getName()).concat("，我走S型路线"));
    }

    @Override
    protected void attack() {
        System.out.println("怪物蛇妖甲展开攻击");
    }

    protected void addBlood(){
        if (this.getBleed() < 10){
            Integer temp = this.getBleed() + 20;
            this.setBleed(temp);
            System.out.println("实施大蛇补血术。。。。。，当前生命值是：" + this.getBleed());
        }
    }
}
