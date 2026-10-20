package BasicMaths;

import java.util.ArrayList;
import java.util.List;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        int n=496;
        List<Integer> divisors=allDivisors(n);
        boolean isPerfect=perfect(divisors,n);
        System.out.println(isPerfect);
    }

    private static boolean perfect(List<Integer> divisors, int n) {
        int sum=0;
        for(int i:divisors){
            sum+= i;
        }
        return sum==n;
    }

    private static List<Integer> allDivisors(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        return list;
    }

}
