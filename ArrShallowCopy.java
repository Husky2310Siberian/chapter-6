package gr.aueb.cf.ch6;

public class ArrShallowCopy {

    public static void main(String[] args) {

        int [] arr = {1,20,3,48};
        int [] arrayCopy = new int [4];

        for (int i = 0; i < arr.length; i++){
            arrayCopy[i] = arr[i];
        }
        printArray(arr);
        System.out.println(" ");
        printArray(arrayCopy);

    }

    public static void printArray (int [] arr){
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}
