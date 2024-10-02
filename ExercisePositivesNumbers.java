package gr.aueb.cf.ch6;

public class ExercisePositivesNumbers {

    public static void main(String[] args) {

        int [] arr = {-4, 12, -3 , -56, 2, -97, -16};
        int [] arr2 = {-4, -12, -3 , -56, -2, -97, -16};

        System.out.println(" the arr has at least one positive : " + isPositives(arr));
        System.out.println(" the arr2 has at least one positive : " + isPositives(arr2));
    }

    public static boolean isPositives (int [] arr){

        boolean isOnePositive = false;

        for ( int element : arr){
            if ( element > 0) {
                isOnePositive = true;
                break;
            }
        }
        return isOnePositive;
    }
}
