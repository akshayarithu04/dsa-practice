package Sorting;

//# Problem: SelectionSort
//# Topic: Sorting
//# Time: O(n^2)

//Selection Sort pattern
//*Assume the current index i contains the minimum.
//*Search the remaining unsorted elements to find the actual minimum index mini.
//*Swap arr[i] with arr[mini].
//*Repeat for the next position.

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,4,16,3,17,2};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[mini]) mini=j;
            }
            swap(arr,mini,i);
        }
    }

    private static void swap(int[]arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
