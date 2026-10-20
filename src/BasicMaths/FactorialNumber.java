package BasicMaths;

public class FactorialNumber {
    public static void main(String[] args) {
        int n=4;
        int fact=factorial(n);
        System.out.println(fact);
    }

    private static int factorial(int n) {
        if(n<=1) return n;
        int ans=1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
}
