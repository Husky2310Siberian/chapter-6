package gr.aueb.cf.ch6;

public class MakeElementsDouble {

    public static void main(String[] args) {
        int [] arr = {-4, -12, 3, 0 , 56, 2, -97, 16};

        int [] newArr = getDoubleElements(arr);

        printArray(newArr);

    }

    /**
     *
     * @param arr is the initial arr
     * @return a newArr with doubled values
     */
    public static int [] getDoubleElements (int [] arr){

        if ( arr == null || arr.length == 0 ) return new int [0] ;

        int count = 0;

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            count++;
        }

          int [] newArr  = new int[count];
          count = 0;

          for ( int element : arr){
              newArr[count] = arr[count];
              count++;
          }
        return newArr;
    }

    public static void printArray (int[] arr){
        for (int element: arr){
            System.out.println(element + " ");
        }
    }
}