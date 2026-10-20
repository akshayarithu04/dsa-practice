package BasicMaths;

public class DigitCounts {
    public static void main(String[] args) {
        int n=12345;
        int digits=digitsCount(n);
        System.out.println(digits);
    }

    private static int digitsCount(int n) {
        int digit=0;
        while(n>0){
            digit++;
            n=n/10;
        }
        return digit;
    }
}
