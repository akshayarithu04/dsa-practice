package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n=4;
        pattern14(n);
    }

    private static void pattern14(int n) {
        for(int i=0;i<n;i++){
            for(char letter='A';letter<='A'+i;letter++){
                System.out.print(letter+" ");
            }
            System.out.println();
        }
    }
}
