package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={6,3,8,2,7,1,5,4};
        insertionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n= arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
