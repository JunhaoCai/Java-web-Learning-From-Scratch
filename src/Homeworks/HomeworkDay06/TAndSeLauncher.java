package Homeworks.HomeworkDay06;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/5
 */
public class TAndSeLauncher {
    public static void main(String[] args) {
        Car car = new Car("", "");
        car.run();
        car.stop();
        System.out.println("=================================");
        Sedan sedan = new Sedan("1", "q", "武大朗");
        sedan.run();
        sedan.stop();
        System.out.println("=================================");
        Taxi taxi = new Taxi("", "京B123", "景顺出租车公司");
        taxi.run();
        taxi.stop();

    }
}
