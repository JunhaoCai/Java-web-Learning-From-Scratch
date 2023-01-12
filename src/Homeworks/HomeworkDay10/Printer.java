package Homeworks.HomeworkDay10;

public class Printer {
    private int index = 1;
    public synchronized void print(int i){
        while (index % 3 == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.print(i);
            index++;
            notifyAll();

    }
    public synchronized void print(char c){
        while (index % 3 != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.print(c);
            index++;
            notifyAll();
    }
}
