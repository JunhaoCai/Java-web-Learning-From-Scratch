package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class Taxi extends Car{
    private String ofTaxiCompany;

    public Taxi(String vehicleType, String licencePlate, String ofTaxiCompany) {
        super(vehicleType, licencePlate);
        this.ofTaxiCompany = ofTaxiCompany;
    }

    @Override
    public void run() {
        System.out.println("乘客您好");
        System.out.println("我是".concat(this.ofTaxiCompany).concat("的，我的车牌是".concat(this.getLicencePlate())
                .concat("您要去哪里？")));
    }

    @Override
    public void stop() {
        System.out.println("目的地已经到了，请您付费下车，欢迎再次乘坐");
    }
}
