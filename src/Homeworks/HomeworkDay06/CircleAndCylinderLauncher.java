package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class CircleAndCylinderLauncher {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.show();
        Cylinder cylinder = new Cylinder(10.0);
        cylinder.showVolume();
        circle.setRadius(2.0);
        circle.show();
        cylinder.setRadius(3.0);
        cylinder.showVolume();
    }
}
