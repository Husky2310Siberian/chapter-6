package gr.aueb.cf.ch6;

public class MinMaxApp {

    public static void main(String[] args) {

        int[] grades = {7, 6, 3, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = grades[minPosition];
        int maxValue = grades[maxPosition];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < minValue) {
                minValue = grades[i];
                minPosition = i;
            }

        }
        for (int j = 0; j < grades.length; j++) {
            if (grades[j] > maxValue) {
                maxValue = grades[j];
                maxPosition = j;
            }
        }
        System.out.println("the min value is : " + minValue + " in position : " + minPosition);
        System.out.println("the max value is : " + maxValue + " in position : " + maxPosition);
    }
}
