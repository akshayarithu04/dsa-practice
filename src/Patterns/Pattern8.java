package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n=4;
        pattern8(n);
    }

    private static void pattern8(int n) {
        int star=2*n-1;
        for(int i=1;i<=n;i++){
            //space
            for(int s1=0;s1<i;s1++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            //space
            for(int s1=0;s1<i;s1++){
                System.out.print(" ");
            }
            star-=2;
            System.out.println();
        }
    }
}
