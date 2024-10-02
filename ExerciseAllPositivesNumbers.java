package gr.aueb.cf.ch6;

public class ExerciseAllPositivesNumbers {

    public static void main(String[] args) {

        int[] arr = {-4, 12, -3, -56, 2, -97, -16};
        int[] arr2 = {-4, -12, -3, -56, -2, -97, -16};
        int[] arr3 = {4, 12, 3, 56, 2, 97, 16};

        System.out.println(" the arr has all positives : " + isAllPositives(arr));
        System.out.println(" the arr2 has all positives : " + isAllPositives(arr2));
        System.out.println(" the arr3 has all positives : " + isAllPositives(arr3));
    }

    public static boolean isAllPositives(int[] arr) {

        boolean isPositive = false;
        int count = 0;
        int n = arr.length;

        for (int element : arr) {
            if (element > 0) count++;
        }
        return count == n;
    }
}