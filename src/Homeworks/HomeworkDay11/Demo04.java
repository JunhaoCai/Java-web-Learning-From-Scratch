package Homeworks.HomeworkDay11;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/12
 */
public class Demo04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next().toString());
        }
    }
}
