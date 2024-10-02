package gr.aueb.cf.ch6;

public class CharAt {

    public static void main(String[] args) {

        String s = "Athens University of Economics and Business";

        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " "); //i cant do (s[i])
        }
    }
}
