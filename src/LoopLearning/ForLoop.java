package LoopLearning;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2022/12/29
 */
public class ForLoop {
    final static int MAX_LENGTH = 10;
    public static void main(String[] args) {
//         int[] myArrays = new int[MAX_LENGTH];
         int[] shuffleArray = new int[]{
                 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        for (int i = 0; i < MAX_LENGTH; i++) {
            for (int j = 0; j < MAX_LENGTH - 1; j++) {
                if (shuffleArray[j] < shuffleArray[j + 1]){
                    int temp = shuffleArray[j];
                    shuffleArray[j] = shuffleArray[j+1];
                    shuffleArray[j+1] = temp;
                }
            }
        }

        for (int i: shuffleArray
             ) {
            System.out.println(i);
        }


    }
}
