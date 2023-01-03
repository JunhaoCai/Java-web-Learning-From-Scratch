package Homeworks.HomeworkDay04;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class ReverseArray {
    public static int[] randomArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length;i++){
            array[i] = (int)(Math.random()*1000);//0~1乘数1000，内容变为0~1000，强转为整型
        }
        return array;
    }
    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = randomArray(10);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
