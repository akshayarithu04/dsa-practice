package BasicMaths;

public class CheckPerfectSquares {
    public static void main(String[] args) {
        int n=9;
        boolean isPerfect=perfectSquare(n);
        System.out.println(isPerfect);
    }

    private static boolean perfectSquare(int n) {
        int square=squareRoot(n);
        if(square*square==n)return true;
        return false;
    }

    private static int squareRoot(int n) {
        long low=0;
        long high=n;
        int ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid<=n) {
                ans=(int)mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}
