package gr.aueb.cf.ch6;

public class TraverseWithSubString {

    public static void main(String[] args) {

        String s = "Athens";

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.substring(i,i+1));
        }
    }
}
