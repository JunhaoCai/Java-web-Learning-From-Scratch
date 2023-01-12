package Homeworks.HomeworkDay10;

public class NumberPrinter extends Thread{
    private Printer p;
    public NumberPrinter(Printer p){
       this.p=p;
    }
    public void run(){
        for (int i = 1; i <= 52 ; i++) {
            p.print(i);
        }
    }
}
