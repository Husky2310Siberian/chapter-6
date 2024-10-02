package gr.aueb.cf.ch6;

public class ExerciseFindValue {


    public static void main(String[] args) {

        int [] arr = {3, 7 , 9 , 1  , 10 , 76 , 56 , -99 };
        int value = -99;
        int position= 0;

        position = getElementPosition(arr, value);
        System.out.printf("the value %d  is in position %d " , value , position);
    }

    /**
     *             Searches and finds the position of a value in an arr
     * @param arr
     * @param value
     * @return  the position of value
     */
    public static int getElementPosition (int [] arr , int value) {

        if ( arr == null) return -1;

        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] == value ) {
                return i;
            }
        }
        return -1;
    }














}
