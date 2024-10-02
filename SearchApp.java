package gr.aueb.cf.ch6;

    /**
     * find the position of a number, in an Array
     */
    public class SearchApp {

        public static void main(String[] args) {

            int[] grades = {3,9,10,2,5,7};
            int grade = 10;
            int positionGrade;

            positionGrade = getPosition(grades, grade);

            System.out.printf("Position: %d , Grade %d", positionGrade +1 ,grades[positionGrade]);
        }

        /**
         * Searches the array to find a specific value. If the
         * value is found, the position of the array is returned.
         * Time complexity is linear 0(n)
         * @param arr
         * @param value
         * @return
         */
        public static int getPosition(int[] arr, int value){

            int positionToReturn = -1;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == value){
                    positionToReturn = i;
                    break;
                }
            }
            return positionToReturn;
        }
    }