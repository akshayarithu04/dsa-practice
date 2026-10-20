package BasicMaths;

public class NumberOfOddDigitsInANumber {
    public static void main(String[] args) {
        int n=1234579;
        int digits=digitsCount(n);
        System.out.println(digits);
    }

    private static int digitsCount(int n) {
        int digit=0;
        while(n>0){
            int digi=n%10;
            if(digi%2!=0){
                digit++;
            }
            n=n/10;
        }
        return digit;
    }
}
