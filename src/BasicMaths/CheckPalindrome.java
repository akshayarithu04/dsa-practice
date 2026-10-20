package BasicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n=121;
        boolean isPalindrome=checkPalindrome(n);
        System.out.println(isPalindrome);

    }

    private static boolean checkPalindrome(int n) {
        int original=n;
        int num=0;
        while(n>0){
            int lastDigit=n%10;
            num=num*10+lastDigit;
            n=n/10;
        }
        return original==num;

    }
}
