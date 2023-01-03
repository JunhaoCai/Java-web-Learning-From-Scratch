package Homeworks.HomeworkDay04;

/**
 * @author junhaocai
 * @email junhaocai01@gmail.com
 * @date 2023/1/3
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int n){
        int front = 0;
        int end = arr.length - 1;
        int mid = (front + end) / 2;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[mid] > n){
                end = mid;
                mid = (front + end) / 2;
            }else if (arr[mid] < n){
                front = mid;
                mid = (front + end + 1) / 2;
            }
            if (arr[mid] == n){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {
            3, 12, 24, 36, 55, 68, 75, 88
        };
        System.out.println(binarySearch(arr, 88));

    }
}
