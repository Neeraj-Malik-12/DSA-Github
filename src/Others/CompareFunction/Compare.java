package Others.CompareFunction;
import Others.PrintString.printString;


public class Compare extends printString{
    public int compare(String a, String b){
        int lenA = a.length();
        int lenB = b.length();
        int diff = 0;
        int minLen = Math.min(lenA, lenB);
        for(int i = 0 ; i < minLen ; i++){
            int ascA = a.charAt(i);
            int ascB = b.charAt(i);
            if(ascB != ascA){
                diff = ascA-ascB;
                break;
            }
        }
        if(diff == 0) diff = lenA-lenB;

        return diff;
    }

    public static void main(String[] args) {
        String a = "neeraj";
        String b = "malik";
        Compare c = new Compare();
        System.out.print("String a is : ");
        c.printString(a);

        System.out.print("String b is : ");
        c.printString(b);

        int ans = c.compare(a,b);
        System.out.print("Difference is : " + ans);
    }
}

