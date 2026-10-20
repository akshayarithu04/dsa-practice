package BasicMaths;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int n1=100;
        int n2=250;
        int lcm=leastCommonMultiple(n1,n2);
        System.out.println(lcm);
    }

    private static int leastCommonMultiple(int n1, int n2) {
        int ans=0;
        int multiple=Math.max(n1,n2);
        while(true){
            if(multiple % n1==0 && multiple % n2==0){
                return multiple;
            }
            multiple++;
        }
    }
}
