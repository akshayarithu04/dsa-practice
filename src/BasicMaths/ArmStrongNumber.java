package BasicMaths;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=123;
        boolean isArmstrong=armStrongNumber(n);
        System.out.println(isArmstrong);
    }

    private static boolean armStrongNumber(int n) {
        int original=n;
        int digits=digitsCount(n);
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            int poweredDigit=numsPower(lastDigit,digits);
            sum+=poweredDigit;
            n=n/10;
        }
        return original==sum;

    }

    private static int numsPower(int n,int power){
        int result=1;
        for(int i=1;i<=power;i++){
            result*=n;
        }
        return result;
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
