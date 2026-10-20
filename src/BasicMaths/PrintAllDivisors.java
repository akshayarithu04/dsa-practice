package BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n=36;
        printAllDivisors(n);
    }

    private static void printAllDivisors(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if((n/i)!=i){
                    list.add(n/i);
                }
            }
        }
        list.sort(null);
        System.out.println(list);
    }

//    private static void printAllDivisors(int n) {
//        for(int i=1;i<=n/2;i++){
//            if(n%i==0){
//                System.out.print(i+" , ");
//            }
//        }
//        System.out.println(n);
//    }


}
