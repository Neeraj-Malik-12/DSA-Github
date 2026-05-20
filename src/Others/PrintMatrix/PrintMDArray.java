package Others.PrintMatrix;
public class PrintMDArray {

    public void PrintRow(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void PrintCol(int[][] arr){
        int j = 0;
        while(j < arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "  ");
            }
            j++;
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3},{5,5,4,1,4}, {3,1,8,2,6}};
        PrintMDArray pa = new PrintMDArray();
        pa.PrintRow(arr);
        pa.PrintCol(arr);
    }
}
