package gr.aueb.cf.ch6;

public class ExerciseFindEvens {

    public static void main(String[] args) {

        int [] arr = {3, 7 , 9 , 1  , 10 , 76 , 56 };
        int [] evenArr = filterEvens(arr);

        printArray(evenArr);
    }

    public static int [] filterEvens (int [] arr) {

        if ( arr == null || arr.length == 0) return new int[0];
        int count = 0;

        for ( int element : arr){
            if( element % 2 == 0){
                count++;
            }
        }

        int[] newArr =  new int [count];
        count = 0;

        for (int element : arr) {
            if (element % 2 == 0) {
                newArr[count] = element;
                count++;
            }
        }
        return newArr;
    }

    public static void printArray (int[] arr){
        for (int element: arr){
            System.out.println(element + " ");
        }
    }
}
