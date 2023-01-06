package Homeworks.HomeworkDay07.Pisa;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class Factory {
    public Pisa pisaClassification(int n){
        if (n == 1){
            return new BaconPizza();
        }
        if (n == 2){
            return new SeafoodPizza();
        }
        return null;
    }
}
