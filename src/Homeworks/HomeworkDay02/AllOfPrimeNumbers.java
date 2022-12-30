package Homeworks.HomeworkDay02;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class AllOfPrimeNumbers {
    public static boolean determinePrimeNumber(int number){
        int counter = 0;
        if (0 < number && number <= 3){
            return true;
        } else if (0 >= number) {
            return false;
        } else{
            for (int i = 1; i <= number; i++) {
                if (number % i == 0){
                    counter++;
                }
            }
            if (counter == 2) {
                return true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 101; i <= 150 ; i++) {
            if (determinePrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
