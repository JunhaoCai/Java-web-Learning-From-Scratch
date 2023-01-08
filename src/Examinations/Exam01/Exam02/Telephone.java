package Exams.Exam01.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/8
 */
public class Telephone extends Product implements CallUp{

    @Override
    public void storeMemory() {
        System.out.println("手机已存储数据！");
    }

    public void callUp(){
        System.out.println("打电话！");
    }
}
