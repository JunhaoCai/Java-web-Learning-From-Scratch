package Homeworks.HomeworkDay07.Pisa;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class BaconPizza extends Pisa{
    public Integer gram;
    private String name = "培根披萨";

    public Integer getGram() {
        return gram;
    }

    public void setGram(Integer gram) {
        this.gram = gram;
    }

    @Override
    public void show() {
        System.out.println("名称：" + this.name);
        System.out.println("价格：" + this.getPrice());
        System.out.println("大小：" + this.getSize());
        System.out.println("培根克数：" + this.getGram());
    }
}
