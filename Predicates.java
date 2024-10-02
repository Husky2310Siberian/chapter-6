package gr.aueb.cf.ch6;

public class Predicates {

    public static void main(String[] args) {
        int [] grades = {1,2,3,4,5,6,7,8,9,10,11,12};
        boolean evenMoreThanTwo = false;
        boolean oddMoreThanTwo = false;
        evenMoreThanTwo = moreThanTwoEvens(grades);
        oddMoreThanTwo = moreThanTwoOdds(grades);


        System.out.println(evenMoreThanTwo);
        System.out.println(oddMoreThanTwo);
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 2;
    }
    public static boolean moreThanTwoOdds (int[] arr){
        if ( arr == null) return false;
        int odds = 0;
        for (int item : arr){
            if ( item % 2 != 0){
                odds++;
            }
        }
        return odds > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr){
        if ( arr== null ) return false;
        int cons = 0;
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] == arr[i+1] - 1 && arr[i]==arr[i+2] - 2){
                cons++;
            }
        }
        return cons >=1;





    }
}
