package gr.aueb.cf.ch6;

/**
 * Demo of concat
 */
public class StrConcat {

    public static void main(String[] args) {

        String s1 = "coding";
        String s2 = "factory";

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);

        System.out.println("s1 + s2 :" +s1 +" " + s2);
        System.out.println("s4: " + s4);
        System.out.println("s6: " + s6);
    }
}
