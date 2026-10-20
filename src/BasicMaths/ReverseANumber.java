package BasicMaths;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=12345;
        int reversedNumber=reverseANumber(n);
        System.out.println(reversedNumber);
    }

    private static int reverseANumber(int n) {
        int num=0;
        while(n>0){
            int lastDigit=n%10;
            num=num*10+lastDigit;
            n=n/10;
        }
        return num;
    }
}
