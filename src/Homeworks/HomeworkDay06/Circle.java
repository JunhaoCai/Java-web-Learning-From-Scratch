package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Circle {
    private Double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    protected Double getArea() {
        return radius * radius * Math.PI;
    }

    protected Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    protected void show(){
        System.out.println("半径：" + this.radius+ "周长：" + this.getPerimeter()+ "面积：" + this.getArea());
    }
}
