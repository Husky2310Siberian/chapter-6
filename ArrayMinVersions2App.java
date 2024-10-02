package gr.aueb.cf.ch6;

public class ArrayMinVersions2App {

    public static void main(String[] args) {
        int [] arr = {7,6,2,9,10,4,6,6,7};
        int minPosition = 0;
        int minValue = 0;
        minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = arr[i];
                minValue = arr[minPosition];
            }

            System.out.println(+minValue  + minPosition);

        }

    }
}
