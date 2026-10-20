package BasicMaths;

public class LargestDigitinaNumber {
    public static void main(String[] args) {
        int n=123457;
        int digit=largestDigit(n);
        System.out.println(digit);
    }

    private static int largestDigit(int n) {
        int max=Integer.MIN_VALUE;
        while(n>0){
            int digi=n%10;
            if(digi>max){
                max=digi;
            }
            n=n/10;
        }
        return max;
    }
}
