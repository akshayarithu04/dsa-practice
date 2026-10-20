package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n=4;
        pattern9(n);
    }

    private static void pattern9(int n) {
        for(int i=1;i<=n;i++){
            //space
            for(int s1=0;s1<n-i;s1++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space
            for(int s1=0;s1<n-i;s1++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //space
            for(int s1=1;s1<i;s1++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            //space
            for(int s1=1;s1<i;s1++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
