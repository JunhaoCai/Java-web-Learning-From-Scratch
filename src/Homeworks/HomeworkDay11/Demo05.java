package Homeworks.HomeworkDay11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/12
 */
public class Demo05 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        for (Integer integer : set) {
            System.out.println(integer);
        }

        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next().intValue());
        }
    }
}
