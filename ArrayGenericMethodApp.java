package gr.aueb.cf.ch6;

public class ArrayGenericMethodApp {

    public static void main(String[] args) {

        int [] grades = {4,8,10,3,6,2,1,4};
        int minPosition = 0;

        minPosition = getMinPosition (grades, 0 , grades.length-1);

        System.out.println(minPosition);
    }

    public static int getMinPosition(int[] arr , int low , int high){
        int minPosition = low;
        int minValue;

        if((low < 0) || (high > arr.length)) {
            System.out.println("error");
            return -1;
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
