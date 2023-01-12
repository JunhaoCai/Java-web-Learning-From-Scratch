package Homeworks.HomeworkDay10;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/12
 */
public class LetterPrinter extends Thread{
    private Printer p;
    public LetterPrinter(Printer p){
        this.p = p;
    }

    public void run(){
        for (char i = 'A'; i <= 'Z' ; i++) {
            p.print(i);
        }
    }
}
