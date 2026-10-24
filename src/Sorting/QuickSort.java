package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr={4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void quickSort(int[] arr,int low,int high) {
        if(low<high){
            int pivot=pivotFun(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int pivotFun(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(arr[i]<=pivot && i<=high-1) i++;
        while(arr[j]>=pivot && j>=low+1) j--;
        if(i<j){
            swap(arr,i,j);
        }else{
            swap(arr,low,j);
        }
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
