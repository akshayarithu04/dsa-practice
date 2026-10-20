package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n=4;
        pattern16(n);
    }

    private static void pattern16(int n) {
        for(int i=0;i<n;i++){
            char letter= (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(letter+" ");
            }
            System.out.println();
        }
    }
}
