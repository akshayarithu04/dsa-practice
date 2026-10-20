package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        pattern17(n);
    }

    private static void pattern17(int n) {
        int letter=1;
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //letter
            for(int j=0;j<letter;j++){
                if(j<(letter/2)+1){
                    char l= (char) ('A'+j);
                    System.out.print(l);
                }else {
                    char l= (char) ('A'+(letter - j - 1));
                    System.out.print(l);
                }
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            letter+=2;
            System.out.println();
        }
    }
}
