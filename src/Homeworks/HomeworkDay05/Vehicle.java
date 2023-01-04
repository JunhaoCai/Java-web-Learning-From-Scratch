package Homeworks.HomeworkDay05;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/4
 */
public class Vehicle {
    private Integer speed;
    private Double size;
    public Vehicle(Integer speed, Double size) {
        this.speed = speed;
        this.size = size;
    }

    protected Integer speedUp(){
        this.speed = speed + 1;
        return this.speed;
    }

    protected Integer speedDown(){
        this.speed = speed - 1;
        return this.speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120, 100.0);
        System.out.println(vehicle.toString());
        vehicle.speedUp();
        System.out.println(vehicle.toString());
        vehicle.speedDown();
        System.out.println(vehicle.toString());
    }
}
