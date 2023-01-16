package Homeworks.HomeworkDay12;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Demo01 {
    public void test1(){
        String str1 = "吉软java";
        byte[] bytes = str1.getBytes();
        String str2 = new String(bytes,0,bytes.length);
        System.out.println(str2);
    }
}
