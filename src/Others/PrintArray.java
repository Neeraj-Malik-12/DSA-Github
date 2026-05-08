package Others;

public class PrintArray {

        public int[] createArray(int n){
            int[] randomArray = new int[n];
            for( int i = 0 ; i < n ; i++){
                randomArray[i] = (int)((Math.random()*10+1));
            }
            return randomArray;
        }
        public void print(int[] arr){
            for(int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

