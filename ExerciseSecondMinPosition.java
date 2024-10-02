package gr.aueb.cf.ch6;

public class ExerciseSecondMinPosition {

    public static void main(String[] args) {
        int [] grades = {4 , 5 , 3 , 9 , -8 , 7 , 0 , 2 };

        int minValue;
        int n = grades.length;

        minValue = getMinPosition(grades, n);

        System.out.println(" the second smaller value is : " + getMinPosition(grades,n));
    }

    /**
     *          returns the second smaller value of an Array
     * @param arr   the Array
     * @param low   the second smaller value
     * @return  the second smaller grade
     */
    public static int getMinPosition (int[] arr , int low) {

        int minValue = arr[0];

        if ( low < 0 || low > arr.length ) {
            System.out.println("Error");
            return -1;
        }

        for ( int i = 0; i < arr.length; i++ ) {
            if (minValue > arr[i]) {

                minValue = arr[i];
            }
        }
        int secondSmallerGrade = Integer.MAX_VALUE;

        for ( int i = 0; i < arr.length; i++){
            if (arr[i] != minValue && arr[i] < secondSmallerGrade) {
                secondSmallerGrade = arr[i];
                }
            }
    return secondSmallerGrade;
    }
}
