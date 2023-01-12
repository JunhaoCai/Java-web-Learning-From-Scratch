package Homeworks.HomeworkDay10;

public class Test1 {
    public static void main(String[] args) {
        Printer p=new Printer();
        Thread t1=new NumberPrinter(p);
        Thread t2=new LetterPrinter(p);
        t1.start();
        t2.start();
    }
}
