package gr.aueb.cf.ch6;

public class ShiftLeftByOne {

    public static void main(String[] args) {

        int [] arr = {1,3,5,7,9};

        shiftLeftByOne(arr,0);
        printArray(arr);
    }

    public static void shiftLeftByOne (int arr[] , int low){
        if (arr == null) return;

        if ((low < 0 ) || (low > arr.length - 1)) return;

        for (int i = 0; i < arr.length -1; i++){
            arr[i] = arr[i+1];
        }
        arr [arr.length - 1] = 0;
    }

    public static void printArray(int [] arr) {

        for (int element : arr){
            System.out.println(element + " ");
        }
    }
}