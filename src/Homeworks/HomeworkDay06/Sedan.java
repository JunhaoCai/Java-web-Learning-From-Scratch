package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Sedan extends Car{
    private String nameofOwner;

    public Sedan(String vehicleType, String licencePlate, String nameofOwner) {
        super(vehicleType, licencePlate);
        this.nameofOwner = nameofOwner;
    }

    @Override
    public void run() {
        System.out.println("我是".concat(this.nameofOwner).concat(",").concat("我的汽车我做主"));

    }

    @Override
    public void stop() {
        System.out.println("目的地到了，我们去玩吧");
    }
}
