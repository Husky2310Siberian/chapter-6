package gr.aueb.cf.ch6;

public class Reducing {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("total is :" + getTotal(arr));
        System.out.println("average is :" + getAverage(arr));
    }


    public static int getTotal(int[] arr){
        if ( arr== null) return 0;
        int total = 0;
        for (int i = 0; i <= arr.length; i++){
            total += i;
        }
        return total;
    }

    public static double getAverage (int[] arr){
        if ( arr== null) return 0;
        int total = 0;
        int avg = 0;
        for (int item : arr){
            total += item;
        }
        return (double) total / arr.length ;

    }
}
