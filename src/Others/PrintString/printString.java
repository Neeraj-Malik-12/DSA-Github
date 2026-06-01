package Others.PrintString;


public class printString {
    public void printString(String s){
        for( int i = 0 ; i < s.length() ; i++ ){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public void printStrArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

