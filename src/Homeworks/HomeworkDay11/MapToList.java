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
public class MapToList {
    public static void mapToList(){
        Student stu1 = new Student(110, "小红", 23, "女",10.2);
        Student stu2 = new Student(111, "小强", 21, "男",18.67);
        Student stu3 = new Student(112, "小花", 12, "女",17.17);

        Map<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(stu1.getId(), stu1);
        map.put(stu2.getId(), stu2);
        map.put(stu2.getId(), stu3);
        List<StudentEntry> list = new ArrayList<StudentEntry>();
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            StudentEntry studentEntry = new StudentEntry();
            studentEntry.setKey(entry.getKey());
            studentEntry.setStu(entry.getValue());
            list.add(studentEntry);
        }

        for (StudentEntry se : list) {
            System.out.println(se.getKey() + "\t" + se.getStu());
        }

    }
}
