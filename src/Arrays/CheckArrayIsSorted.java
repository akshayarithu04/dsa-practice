package Arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[]arr={6,9,0,1,2};
        boolean isSorted=isSorted(arr);
        System.out.println(isSorted);
    }

    private static boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]) return false;
        }
        return true;
    }
}
