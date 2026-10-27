package Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[]arr={6,9,0,1,2};
        int secondLarge=secondLargest(arr);
        System.out.println(secondLarge);
    }

    private static int secondLargest(int[] arr) {
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
