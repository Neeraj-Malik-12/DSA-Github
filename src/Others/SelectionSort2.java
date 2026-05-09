package Others;

import java.util.Scanner;

public class SelectionSort2 extends PrintArray {   // PrintArray class is extended which contains 2 functions ( createArray and print )

    //The objective is to do the selection sort again but in a different way than the traditional one to deeply master the selection sort logic
    // we have to select the largest element in the array and place it at the right of array and repeat the process with rest of elements

    public void selectionSortTwo(int[] arr){
        for( int i = arr.length-1 ; i>0 ; i--){
            int max = Integer.MIN_VALUE;
            int maxindex = 0;
            for(int j = i ; j>=0 ; j--){
                if(arr[j] > max){
                    max = arr[j];
                    maxindex = j;
                }
            }
            int temp = arr[maxindex];
            arr[maxindex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SelectionSort2 ss = new SelectionSort2();
        int[] arrayOne = ss.createArray(n);   // creates a random array using Math.random()
        ss.print(arrayOne);                   // print the array
        ss.selectionSortTwo(arrayOne);
        ss.print(arrayOne);
    }
}

// Output :
// Enter the length of array : 12
// Input array :  8 2 2 1 5 7 10 3 2 10 1 2   (unsorted)
// Output array : 1 1 2 2 2 2 3 5 7 8 10 10   (sorted)

