package Others;

public class Move0ToEndUsingBubble extends PrintArray {

    //The Objective is to move all the zeros of the array to the end of the array without altering the sequence of non-negative elements

        public void moveZeros(int[] arr){
            for(int i = 0 ; i < arr.length-1 ; i++){
                for( int j = 0 ; j < arr.length-1-i ; j++){
                    if(arr[j] == 0){
                        arr[j] = arr[j+1];
                        arr[j+1] = 0;
                    }
                }
            }
        }

        public void moveZerosOptimized(int[] arr){
            int j = 0;
            for( int i = 0 ; i < arr.length ; i++){
                if(arr[i] != 0){
                    if( i != j ){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }
        }
        public static void main(String[] args) {
            Move0ToEndUsingBubble me = new Move0ToEndUsingBubble();
            int[] arrayOne = {2,4,0,6,2,0,0,7,1,0,8};
            int[] arrayTwo = {2,4,0,6,2,0,0,7,1,0,8};
            me.print(arrayOne);
            System.out.print("Brute method : ");
            me.moveZeros(arrayOne);
            me.print(arrayOne);

            me.print(arrayTwo);
            System.out.print("Optimized method : ");
            me.moveZerosOptimized(arrayTwo);
            me.print(arrayTwo);
        }
    }

