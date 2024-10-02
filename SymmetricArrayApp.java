package gr.aueb.cf.ch6;

/**
 * Demo of symmetric array
 */
public class SymmetricArrayApp {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};

        System.out.println(" Is symmetric: " + isSymmetric(arr));
    }

    /**
     * checks if an array is symmetric or no
     * it is read the same RTL and LTR
     * @param arr   the input array
     * @return  true , if it is symmetric,
     *          false otherwise
     */
    public static boolean isSymmetric (int[] arr){
        boolean symmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++,  j-- ){

            if(arr[i] != arr[j]){
                symmetric = false;
                break;
            }
        }
        return symmetric;
    }
}
