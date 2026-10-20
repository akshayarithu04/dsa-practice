package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        pattern5(n);
    }

    private static void pattern5(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
