package gr.aueb.cf.ch6;

public class ArrayMin2App {

    public static void main(String[] args) {

        int [] arr = {4,6,3,8,9,2,11};
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.println("min value is :" + minValue + " in position :" + minPosition);
    }
}
