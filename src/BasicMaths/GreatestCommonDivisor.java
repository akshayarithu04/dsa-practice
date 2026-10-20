package BasicMaths;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n1=10;
        int n2=6;
        int gcd=greatestCommonDivisor(n1,n2);
        System.out.println(gcd);
    }

    private static int greatestCommonDivisor(int a, int b) {
       while(a>0 && b>0){
           if(a>b) a=a%b;
           else b=b%a;
       }
       if(a==0)return b;
       return a;
    }

}

//    private static int greatestCommonDivisor(int n1, int n2) {
//        int min=Math.min(n1,n2);
//        int gcd=0;
//        for(int i=1;i<=min;i++){
//            if((n1%i==0) && (n2%i)==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }
//}
