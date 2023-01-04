package Homeworks.HomeworkDay05;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/4
 */
public class Circle {
    private Double r;
    private Point point;

    public Circle(Double r, Point point) {
        this.r = r;
        this.point = point;
    }

    protected Double getArea(){
        return Math.PI * r *r;
    }

    protected Double getPerimeter(){
        return Math.PI * r * 2;
    }

    protected Boolean estimatePointInsideCircle(Point p){
        double estimate =  Math.sqrt((p.getX() - this.point.getX()) + (p.getY() - this.point.getY()));
        return estimate <= r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", point= (" + point.getX() + ", " + point.getY() +
                ") }";
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5, new Point(0.0, 0.0));
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());
        System.out.println(circle.estimatePointInsideCircle(new Point(0.1, 0.2)));
    }
}
