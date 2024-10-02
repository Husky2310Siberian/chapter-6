package gr.aueb.cf.ch6;

public class GradesPercentageApp {

    public static void main(String[] args) {

    int [] grades = {1,2,2,4,5,5,0,2,0,4,5,2,1,1};
    int [] counts = new int[6];

    for (int grade : grades ){
        counts[grade]++;
    }

    for (int j = 0; j < counts.length; j++){

        System.out.printf("grade %d : %.2f%%\n", j , (double) counts[j] / grades.length);
    }
    }
}
