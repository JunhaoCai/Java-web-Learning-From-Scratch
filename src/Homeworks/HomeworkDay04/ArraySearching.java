package Homeworks.HomeworkDay04;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class ArraySearching {
    public static void searching(String [] strings){
        System.out.println("请输入一个单词：");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean flag = false;
        for (String string : strings) {
            if (Objects.equals(word, string)) {
                System.out.println("Yes");
                flag = true;
            }
        }
        if (!flag){
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        String [] strings = new String [] {"pig", "dog", "duck", "apple", "banana", "goose", "fabulous", "bird", "grape", "strawberry"};
        searching(strings);
    }
}
