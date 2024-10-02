package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayReplaceNextArraysClassApp {

    public static void main(String[] args) {

        int [] ages = {34 , 37 , 42 , 64 , 70};

        ages = Arrays.copyOf(ages, ages.length-1); //copy in ages, a new array , with deleted the last element

        ages = Arrays.copyOf(ages , ages.length +1);    //right padding with zero

        for (int age : ages) {
            System.out.println(age + " ");
        }
    }
}
