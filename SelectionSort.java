package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {99, 1 , 5 , 3 , 9 , 7 , 12 , 2 , 0 , 34, 4 , 43 };
        selectionSort(arr);
        traverseArray(arr);
    }

    public static void selectionSort(int[] arr){
        if(arr == null) return;

        int min;
        int minPosition;

        for(int i = 0; i < arr.length -1; i++){

            min = arr[i];
            minPosition = i;

            for(int j = i + 1; j < arr.length; j++){

                if(arr[j] < min){
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, i , minPosition); //this method, each time interchanges i with minPosition
        }
    }

    public static void swap (int[]arr, int i, int j){

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void traverseArray(int[] arr ){
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
