package gr.aueb.cf.ch6;

public class Filtering2App {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] evenArr = isfilterEven(arr);
        traverse(evenArr);
    }


    public static int[] isfilterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];

        int count = 0;

        for (int element : arr) {
            if (element % 2 == 0){
                count++;
            }
        }

        int[] returnedArr = new int[count];
        count = 0;

        for (int element : arr) {
            if (element % 2 ==0) {
                returnedArr[count] = element;
                count++;
            }
        }
        return returnedArr;
    }

    public static void traverse(int[] arr){
        for(int element: arr) {
            System.out.print(element + " ");
        }
    }
}
