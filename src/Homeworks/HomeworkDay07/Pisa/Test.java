package Homeworks.HomeworkDay07.Pisa;

import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.print("请选择想要制造的比萨(1. 培根披萨 2. 海鲜披萨)：");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Factory factory = new Factory();
        Pisa p1 = factory.pisaClassification(input);

        System.out.println("请输入培根克数：");
        int gram = scanner.nextInt();
        BaconPizza b = (BaconPizza) p1;
        b.setGram(gram);

        System.out.println("请输入配料信息：");
        String ingredient = scanner.next();
        String ingredient1 = scanner.next();
        String ingredient2 = scanner.next();
        SeafoodPizza s = (SeafoodPizza) p1;
        s.setFoodIngredient(ingredient);
        s.setFoodIngredient(ingredient1);
        s.setFoodIngredient(ingredient2);
        System.out.print("请输入比萨大小：");
        int size = scanner.nextInt();
        p1.setSize(size);
        System.out.print("请输入比萨价格：");
        int price = scanner.nextInt();
        p1.setPrice(price);
        p1.show();


    }
}
