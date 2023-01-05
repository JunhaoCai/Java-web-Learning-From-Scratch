package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Cylinder extends Circle{
    private Double height;

    public Cylinder(Double height) {
        super();
        this.height = height;
    }

    public Cylinder(Double radius, Double height) {
        super(radius);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    protected Double getVolume(){
        return super.getArea() * this.height;
    }

    protected void showVolume(){
        System.out.println("体积为：" + this.getVolume());
    }
}
