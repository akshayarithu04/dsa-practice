package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n=4;
        pattern13(n);
    }

    private static void pattern13(int n) {
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
