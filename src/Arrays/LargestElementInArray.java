package Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[]arr={6,9,0,2,1};
        int largest=largestElement(arr);
        System.out.println(largest);
    }

    private static int largestElement(int[] arr) {
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}
