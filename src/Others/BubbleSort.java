package Others;
import java.util.Scanner;

public class BubbleSort {
    public void sortingBrute(int[] arr){
        for( int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j < arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


public static void main(String[] args) {
    System.out.println("Enter the length of array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BubbleSort bs = new BubbleSort();
    int[] array = {2,4,1,6,2,8,0};
    for(int ele : array){
        System.out.print(ele);
    }
    System.out.println();
    bs.sortingBrute(array);
    for(int ele : array){
        System.out.print(ele);
    }
    System.out.println();
}}

