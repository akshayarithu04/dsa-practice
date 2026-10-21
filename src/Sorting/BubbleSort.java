package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={6,3,8,2,7,1,5,4};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    didSwap=1;
                }
            }
            if(didSwap==0)break;
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
