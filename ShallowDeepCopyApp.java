package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Demo of shallow vs deep (fresh copy)
 */
public class ShallowDeepCopyApp {

    public static void main(String[] args) {
        int [] [] grid = {{1,2,3} ,
                          {4,5,6}};

//        int[][] gridCopyReference = copyReference(grid);
//        gridCopyReference[0][0] = 100;  //changed in the original and copy array, the [0][0]
//        traverse(grid);
//
//        int[][] gridShallowCopy = shallowCopy(grid);
//        gridShallowCopy[0][0] = 200;
//        traverse(gridShallowCopy);

        int[][] gridDeepCopy = deepCopy(grid);      //with deepCopy, the grid does not effect
        gridDeepCopy[0][0] = 200;
        traverse(grid);
    }

    public static int[][] shallowCopy (int[][] arr){        //not safe
        return Arrays.copyOf(arr, arr.length);
    }

    /**
     * Returns (shallow copy) the reference of the
     * two-dim array.
     * @param arr the input two-dim array
     * @return  a reference which essentially is
     *             a shallow copy
     */
    public static int[][] copyReference (int[] [] arr){
        return arr;
    }

    public static void traverse (int[][] arr){
        for(int [] row : arr){
            for(int col : row){
                System.out.println(col + " ");
            }
            System.out.println();
        }
    }

    public static int [][] deepCopy (int[][] arr){   //most secured and used
        int[][] arrayToReturn = new int[arr.length][];

        for (int i = 0; i < arr.length; i++){
            arrayToReturn[i] = new int [arr[i].length];
//            for (int j = 0; j < arr[i].length; j++){
//                arrayToReturn[i][j] = arr[i][j];
//            }

            arrayToReturn[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return arrayToReturn;
    }
}
