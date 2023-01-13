package Homeworks.HomeworkDay11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/12
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book b1 =new Book(1,"天书奇谈",20.0,"北方出版社");
        Book b2 =new Book(2,"红楼梦",50.0,"南方出版社");
        Book b3 =new Book(3,"西游记",250.0,"北方出版社");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        Map<Integer,Book> map = new HashMap<>();
        map.put(b1.getId(),b1);
        map.put(b2.getId(),b2);
        map.put(b3.getId(),b3);
        for (Map.Entry<Integer, Book> stringBookEntry : map.entrySet()) {
            System.out.println(stringBookEntry.toString());
        }

    }
}
