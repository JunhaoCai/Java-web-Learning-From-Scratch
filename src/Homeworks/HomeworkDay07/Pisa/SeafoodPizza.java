package Homeworks.HomeworkDay07.Pisa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class SeafoodPizza extends Pisa{
    private List<String> foodIngredient = new ArrayList<>();
    private String name = "海鲜披萨";

    public List<String> getFoodIngredient() {
        return foodIngredient;
    }

    public void setFoodIngredient(String ingredient) {
        this.foodIngredient.add(ingredient);
    }

    @Override
    public void show() {
        System.out.println("名称：" + this.name);
        System.out.println("价格：" + this.getPrice());
        System.out.println("大小：" + this.getSize());
        System.out.print("配料：" + this.foodIngredient.get(0));
        System.out.print("、");
        System.out.print(this.foodIngredient.get(1));
        System.out.print("、");
        System.out.print(this.foodIngredient.get(2));
    }
}
