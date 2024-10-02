package gr.aueb.cf.ch6;

public class IndexOfSubString {

    public static void main(String[] args) {

        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');
        int positionofnexto = s.indexOf('o', 2);

        System.out.println("Position of o is: " + positionOfo);
        System.out.println("Position of o is: " + positionofnexto);

        String odToEnd = s.substring(1);
        System.out.println(odToEnd);

        String od = s.substring(1,3);
        System.out.println(od);
    }
}
