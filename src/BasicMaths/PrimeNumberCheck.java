package BasicMaths;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n=13;
        boolean isPrime=primeNumberCheck(n);
        System.out.println(isPrime);
    }

    private static boolean primeNumberCheck(int n) {
        if(n<=1)  return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

//    private static boolean primeNumberCheck(int n) {
//        for(int i=2;i<Math.sqrt(n);i++){
//            if(n%i==0) return false;
//        }
//        return true;
//    }

}
