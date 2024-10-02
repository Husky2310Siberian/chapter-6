package gr.aueb.cf.ch6;

public class GradesDistributionApp {

    public static void main(String[] args) {
        int [] grades = {1,2,3,4,9,8,7,6,5,4,32,12,45,67,89,76,54,23,66,88,91,100};
        int [] distribution = new int[10];

        for (int grade : grades) {
            if (grade == 100) distribution[9] += 1;
            else distribution[grade/10] += 1;
        }

        for ( int i = 0; i < distribution.length; i++){
            System.out.printf("%02d-%02d", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            for (int j = 1; j <= distribution[i]; j++){
                System.out.println(" * ");
            }
            System.out.println();
        }



    }
}
