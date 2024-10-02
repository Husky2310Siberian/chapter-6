package gr.aueb.cf.ch6;

public class FilteringApp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int [] evenArr = filterEven(arr);
        traverse(evenArr);
    }

    public static int[] filterEven(int[] arr){
        if(arr==null || arr.length == 0) return new int[0];
        int count = 0;

        for(int element : arr){
            if(element % 2 == 0){
                count++;
            }
        }

        int[] returnedArr = new int[count];
        count = 0;

        for (int element : arr){
            if(element % 2 == 0){
                returnedArr[count] = element;
                count++;
            }
        }
        return returnedArr;
    }

    public static void traverse(int[] arr){
        for (int element :arr){
            System.out.print(element + " ");

        }
    }

    public static boolean areSameEnding (int[] arr, int threshold){

        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item: arr){
            endings[item % 10]++;
        }

        for (int item:arr){
            if (item >= threshold){
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupOfTen (int[] arr, int threshold){

        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item:arr){
            tens[item / 10]++;
        }

        for (int item:arr){
            if(item >= threshold){
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
