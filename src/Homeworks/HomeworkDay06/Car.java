package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Car{
    private String vehicleType;
    private String licencePlate;


    public Car(String vehicleType, String licencePlate) {
        this.vehicleType = vehicleType;
        this.licencePlate = licencePlate;
    }

    public void run(){
        System.out.println("我是车，我启动");

    }

    public void stop(){
        System.out.println("我是车，我停止");
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
