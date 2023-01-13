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
public class ListToMap {
    public static void listToMap(){
        Student s1 = new Student(1,"小红",17,"男",10);
        Student s2 = new Student(3,"小航",15,"女",20);
        Student s3 = new Student(2,"肖子",13,"女",15);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (Student student : list) {
            System.out.println(student.toString());
        }
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        for (Map.Entry<Integer, Student> integerStudentEntry : map.entrySet()) {
            System.out.println(integerStudentEntry.toString());
        }
    }
}
