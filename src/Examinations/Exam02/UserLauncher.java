package Exams.Exam02;

import java.util.*;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class UserLauncher {
    public static void main(String[] args) {
        Map<Integer,User> map = new HashMap<Integer,User>();
        System.out.println("请输入用户名：");
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.setUsername(scanner.nextLine());
        System.out.println("请输入密码：");
        user.setPassword(scanner.nextLine());
        map.put(1, user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(map.containsValue(user));
        System.out.println("请输入要查询的用户名：");
        String name = scanner.nextLine();

        Set<Integer> keySet = map.keySet();

        for (Integer key : keySet) {
            if (map.get(key).username.equals(name)){
                System.out.println("存在");
                System.out.println(map.get(key));
            }
        }
    }
}
