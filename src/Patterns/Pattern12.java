package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        pattern12(n);
    }

    private static void pattern12(int n) {
        int space=(2*(n-1))-1;
        for(int i=1;i<=n;i++){
            //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //number
            if(i==n){
                for(int j=i-1;j>=1;j--){
                    System.out.print(j);
                }
            }
            else{
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
            }
            space-=2;
            System.out.println();
        }
    }
}
