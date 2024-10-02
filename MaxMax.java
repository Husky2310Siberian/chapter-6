package gr.aueb.cf.ch6;

public class MaxMax {

    public static void main(String[] args) {

        int [] grades = { 7 , 9 , 8 , 6 , 8 , 10 , 3 , 1 };
        int maxPosition = 0;

        maxPosition = getMaxPosition(grades , 0 , grades.length - 1);

        System.out.println(" max position is : " + maxPosition + " max value is " + grades[maxPosition]);
    }

    public static int getMaxPosition(int [] grades , int low , int high){

        int maxValue = high;
        int maxPosition = 0;

        if ( high < 0 || high > grades.length ){
            System.out.println("error");
            return -1;
        }

        maxValue = grades[maxPosition];

        for ( int i = low; i <= high; i++){
            if ( maxValue < grades[i]){
                maxValue = grades[i];
                maxPosition = i;
                maxValue = grades[maxPosition];
            }
        }
        return maxPosition;
    }
}
