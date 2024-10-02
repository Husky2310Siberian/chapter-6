package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArraysUtilApp {

    public static void main(String[] args) {

        int[] arr = {5,6,8,9,12,34,1};
        int[] arrayCopy;      // mention a arrCopy
        int[] arraySecondCopy;
        int[] arrayThirdCopy;

        // Array sort
        Arrays.sort(arr);
        traverse(arr);      //call method traverse for arr []

        System.out.println();

        arrayCopy = Arrays.copyOf(arr, arr.length);   //βάζω arr.length για να υπολογίσει και το -1
        traverse(arrayCopy);

        System.out.println();

        arraySecondCopy = Arrays.copyOfRange(arr, 1, arr.length);   //ταξινομεί τον πίνακα και μετά ton κάνει copy χωρίς το 1o στοιχείο
        traverse(arraySecondCopy);

        System.out.println();

        arrayThirdCopy = Arrays.copyOfRange(arr, 1, arr.length + 5); //με αυτό το +5, κάνει right padding με μηδενικά
        traverse(arrayThirdCopy);
    }

    public static void traverse (int[] arr){

        for(int item: arr){
            System.out.println(item + " ");
        }
    }
}
