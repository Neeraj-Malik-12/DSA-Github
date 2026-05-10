package Others.InsertionSort;
import Others.PrintArray;
import java.util.Scanner;

public class Solution extends PrintArray {

    public void insertionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution is = new Solution();
        int[] arrayOne = is.createArray(n);
        is.print(arrayOne);
        is.insertionSort(arrayOne);
        is.print(arrayOne);
    }
}

