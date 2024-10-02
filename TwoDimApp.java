package gr.aueb.cf.ch6;

public class TwoDimApp {

    public static void main(String[] args) {

        int[][] arr1 = new int [2][3];   //create a two dimensions array , with 2 rows and three columns
        arr1[0][2] = 10; //the 0,2 point is 10

        for(int i = 0; i < arr1.length; i++){    //
            for(int j = 0; j < arr1[i].length; j++){ //the name of index is arr[i].....j traverses in arr[i]
                System.out.println(arr1[i][j] + " "); //prints the first row
            }
            System.out.println(); // prints the second row
        }

        int[][] arr2 = {{1,2},      //3 rows and 2 columns, unsized initiallization
                        {3,4},
                        {5,6}
        };

        System.out.println();
        for(int [] row : arr2){     //for each row
            for(int column : row){  //for each column of row
                System.out.println(column + " ");
            }
            System.out.println();
        }

        int[] [] arr3 = new int[] []  {{1,2,3},
                                        {4,5,6}};   //Array initializer

        int[] [] arr4 = new int [3] [];    // δηλώνουμε μόνο τις γραμμές
        arr4[0] = new int[10];      //δηλώνουμ τη διάσταση της κάθε στήλης
        arr4[1] = new int[3];
        arr4[2] = new int[20];

            System.out.println();
            for(int [] row : arr4) {
               for (int col : row){
                    System.out.println(col + " ");
                }
                System.out.println();
            }
        }
    }
