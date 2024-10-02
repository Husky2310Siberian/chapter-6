package gr.aueb.cf.ch6;

import java.util.Scanner;

public class ExercisePredicatesApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        final int CHOICE = 6;
        int [] choice = new int[CHOICE];

        System.out.println("please six numbers from 1 to 49");

        choice  = new int[]{sc.nextInt()};

        System.out.println(getMoreThanThreeEvens(choice));
    }

    /**
     *
     * @param arr
     * @return
     */
    public static boolean getMoreThanThreeEvens (int [] arr) {

        if ( arr == null) return false;

        arr = new int [5];
        int choice = 0;
        int evens = 0;

        choice = sc.nextInt();

        for ( int i = 0; i < arr.length -1; i++){
            if ( arr[i] % 2 == 0){
                 evens++;
            }
            choice = sc.nextInt();
        }
        return evens < 3;
    }
}
