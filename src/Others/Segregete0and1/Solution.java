package Others.Segregete0and1;
import Others.PrintArray;


    public class Solution extends PrintArray{

        // two pass solution
        public void Segregate(int[] arr){
            int zeros = 0;
            int ones = 0;
            for ( int ele : arr){
                if( ele == 0) zeros++;
                else ones++;
            }

            for ( int i = 0 ; i < zeros ; i++){
                arr[i] = 0;
            }
            for( int i = zeros ; i < (zeros + ones ) ; i++){
                arr[i] = 1;
            }

        }

        // one pass solution ( 2 pointer technique )
        public void segregateOptimized(int[] arr){
            int i = 0;
            int j = arr.length-1;

            while( i < j ){
                if( arr[i] == 1 && arr[j] == 0){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }

                if(arr[i] == 0) i++;
                if(arr[j] == 1) j--;
            }
        }

        public static void main(String[] args) {
            int[] array = {0, 1, 1, 0, 1, 0};
            Solution sg = new Solution();
            sg.print(array);
            sg.segregateOptimized(array);
            sg.print(array);
        }
    }
