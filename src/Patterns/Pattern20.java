package Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        pattern20(n);
    }

    private static void pattern20(int n) {
        int space=2*n-2;
        for(int i=1;i<n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        for(int i=1;i<=2*n-1;i++){
            System.out.print("*");
        }
        System.out.println();
        int space1=1;
        for(int i=1;i<n;i++){
            //star
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=space1;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
            }
            space1+=2;
            System.out.println();
        }
    }
}
