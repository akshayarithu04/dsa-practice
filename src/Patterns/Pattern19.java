package Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int n=4;
        pattern19(n);
    }

    private static void pattern19(int n) {
        int space=0;
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        int space1=2*n-2;
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<space1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            space1-=2;
            System.out.println();
        }
    }
}
