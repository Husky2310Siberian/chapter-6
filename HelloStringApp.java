package gr.aueb.cf.ch6;

public class HelloStringApp {

    public static void main(String[] args) {
        
        String s = "Alice";
        String s2 = new String("Bob");

        System.out.println("Length of \"Alice\" s: " + s.length());   //method length counts the length of string
        System.out.println("Length of \"Bob\" s2: " + s2.length());
        
    }
}
