package Others.SortingStringsLexographically;
import java.util.Arrays;
import Others.PrintString.printString;

public class SortLexo extends printString {
        public void sort(String[] arr){
            Arrays.sort(arr);
        }

        public static void main(String[] args) {
            String[] str = { "Helpful", "Hello", "Help" };
            SortLexo vp  = new SortLexo();
            vp.printStrArr(str);
            vp.sort(str);
            vp.printStrArr(str);
        }
}
