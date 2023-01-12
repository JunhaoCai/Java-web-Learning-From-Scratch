package Homeworks.HomeworkDay10;
class Window implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (this){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ":票号为"+ticket--);
            }else{
                System.out.println(Thread.currentThread().getName() + "车票售空！！！");
                break;
            }
            }
        }

    }
}

public class Demo01  {
    public static void main(String[] args) {
        Window window=new Window();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
        Thread t4 = new Thread(window);
        Thread t5 = new Thread(window);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t4.setName("窗口4");
        t5.setName("窗口5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
