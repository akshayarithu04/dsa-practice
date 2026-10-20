package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n=4;
        pattern6(n);
    }

    private static void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
