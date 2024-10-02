package gr.aueb.cf.ch6;

public class ArrayUnsizedInitApp {

    public static void main(String[] args) {

        int [] [] grid = {{1,2} , {3,4} , {5,6}};

        for (int [] row : grid){
            for (int column : row){
                System.out.println(column +  " ");
            }
            System.out.println(" ");
        }
    }
}
