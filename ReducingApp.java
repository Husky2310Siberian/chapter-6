package gr.aueb.cf.ch6;

public class ReducingApp {

    public static void main(String[] args) {

    }

    public static int getSum(int[] arr){

        if(arr == null || arr.length == 0 ) return -1;
        int sum = 0;

        for (int item: arr){
            sum += item;
        }
        return sum;
    }

    public static double getAvg(int[] arr) {
        int sum = 0;
        int avg = 0;
        if(arr == null || arr.length == 0) return -1; {

            for (int item:arr) {
                sum += item;
            }
        }
        return (double) sum/ arr.length;
    }
}
