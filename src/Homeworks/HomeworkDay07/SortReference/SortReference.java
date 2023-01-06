package Homeworks.HomeworkDay07.SortReference;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/6
 */
public class SortReference{
    public static void main(String[] args) {

        Person p1 = new Person("A", 10);
        Person p2 = new Person("B", 8);
        Person p3 = new Person("C", 7);
        Person p4 = new Person("D", 11);
        Person p5 = new Person("E", 12);
        Person p6 = new Person("F", 21);
        Person p7 = new Person("G", 18);
        Person p8 = new Person("H", 19);
        Person p9 = new Person("I", 221);
        Person p10 = new Person("J", 110);
        Person[] p = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        Person[] pp = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};

        for (Person person : p) {
            System.out.print("姓名" + person.name + "，年龄" + person.age + "\t");
        }
        System.out.println("================");

        Arrays.sort(p);
        for (Person person : p) {
            System.out.print("姓名" + person.name + "，年龄" + person.age+ "\t");
        }
        System.out.println("================");

        for (Person person : pp) {
            System.out.print("姓名" + person.name + "，年龄" + person.age+ "\t");
        }
        System.out.println("================");

        p1.sort(pp);
        for (Person person : pp) {
            System.out.print("姓名" + person.name + "，年龄" + person.age+ "\t");
        }



    }

}
