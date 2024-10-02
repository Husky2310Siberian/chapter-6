package gr.aueb.cf.ch6;

import java.util.Scanner;

public class IOStringApp {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       String s1 = " ";
       String s2 = " ";

        System.out.println("please insert two strings");

        s1 = sc.next(); //reads until find whitespace, \t, \n
        s2 = sc.nextLine(); //reads until find \n, cunsumes  \n, but does not show

        System.out.printf("s1 : %s\n" ,s1);
        System.out.printf("s2 : %s\n" , s2);


    }
}
