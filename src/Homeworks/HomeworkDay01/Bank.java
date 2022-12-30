package Homeworks.HomeworkDay01;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/28
 */
public class Bank {
    public static double currentDeposit(double date, double amount){
        double deposit = amount * (date * 0.0035 + 1);
        return Math.round(deposit);
    }
    public static double oneYearFixedTermDeposit(double amount){
        double deposit = amount * (0.015 + 1);
        return Math.round(deposit);

    }
    public static double twoYearFixedTermDeposit(double amount){
        double deposit = amount * (0.021 * 2 + 1);
        return Math.round(deposit);

    }
    public static void main(String[] args) {
        System.out.println("活期1年本金总计：" + currentDeposit(1, 10000));
        System.out.println("活期2年本金总计：" + currentDeposit(2, 10000));
        System.out.println("定期1年本金总计：" + oneYearFixedTermDeposit(10000));
        System.out.println("定期2年本金总计：" + twoYearFixedTermDeposit(10000));

    }
}
