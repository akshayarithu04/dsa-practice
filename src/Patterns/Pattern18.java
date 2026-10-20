package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n=5;
        pattern18(n);
    }

    private static void pattern18(int n) {
        for(int i=0;i<n;i++){
            char start= (char) ('E'-i);
            for(char ch=start;ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
