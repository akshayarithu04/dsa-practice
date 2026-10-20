package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n=4;
        pattern15(n);
    }

    private static void pattern15(int n) {
        for(int i=0;i<=n;i++){
            for(char letter='A';letter<'A'+(n-i);letter++){
                System.out.print(letter+" ");
            }
            System.out.println();
        }
    }
}
