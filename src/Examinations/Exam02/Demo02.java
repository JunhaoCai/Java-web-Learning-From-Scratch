package Exams.Exam02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/15
 */
public class Demo02 {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        for(int i = 2;i <= 100;i += 2){
            System.out.println("i= " + i);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 1;i <= 100;i += 2){
            System.out.println("i= " + i);
        }
    }
}
