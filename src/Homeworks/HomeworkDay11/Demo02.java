package Homeworks.HomeworkDay11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/12
 */
public class Demo02 {
    public static void main(String[] args) {
        Book b1 =new Book(1,"天书奇谈",20.0,"北方出版社");
        Book b2 =new Book(3,"红楼梦",50.0,"南方出版社");
        Book b3 =new Book(2,"西游记",250.0,"北方出版社");
        Set<Book> set = new HashSet<>();
        set.add(b1);
        set.add(b1);
        set.add(b2);
        set.add(b2);
        set.add(b3);
        for (Book book : set) {
            System.out.println(book);
        }
        System.out.println("-----------------------");
        TreeSet<Book> treeSet = new TreeSet<>();
        treeSet.add(b1);
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b2);
        treeSet.add(b3);
        treeSet.add(b3);
        for (Book book : treeSet) {
            System.out.println(book);
        }
    }
}
