package gr.aueb.cf.ch6;

public class ExerciseMaxPosition {

    public static void main(String[] args) {

        int [] grades = { 7 , 9 , 8 , 6 , 8 , 10 , 3 , 1 , 0 };
        int maxPosition = 0;

        maxPosition = getMaxPosition(grades , 0 , grades.length - 1);

        System.out.printf("The max position is %d: and max value is : %d " , grades[maxPosition], maxPosition + 1);
    }

    public static int getMaxPosition (int [] arr, int low, int high) {

        int maxPosition = high;
        int maxValue = 0;

        if ( high < 0 || high > arr.length - 1){
            System.out.println("Error in array dimensions");
            return -1;
        }

        maxValue = arr[high];

        for (int i = low; i <= high; i++){
            if ( maxValue < arr[i]){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
