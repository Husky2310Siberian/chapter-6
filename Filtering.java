package gr.aueb.cf.ch6;

public class Filtering {

    public static void main(String[] args) {
        int [] grades = new int [] {4,9,9,8,7,2,1,4,10};
        int PASS = 5;

        int [] passed = getPassGrades(grades, PASS);
        for(int pass: passed){
            System.out.println(pass + "");
        }


    }

    public static int[] getPassGrades (int[] grades, int limit){
        int count = 0;
        if (grades == null) return null;
        for (int grade : grades){
            if (grade >= limit){
                count++;
            }
        }

        int[] passedOut = new int [count];
        int pivot = -1;
        for (int grade: grades) {
            if (grade >= limit ){
                passedOut[++pivot] = grade;
            }
        }
        return passedOut;
    }

}
