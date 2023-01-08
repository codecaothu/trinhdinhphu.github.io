package BTVN_T2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        final int numStudent;
        int [] student;
        double tong = 0;

        System.out.print("Enter the number of students: ");
        numStudent =  sc.nextInt();

        student = new int [numStudent];

        if (student.length > 0){
            for (int i = 0; i < student.length; i++){
                System.out.print("Enter the grade for student " +(i+1) + ": ");
                student[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < student.length; i++){
            tong += student[i];
        }
        double average = (double) tong/student.length;
        System.out.println("The average is: " +average);

        int min = student[0];
        int max = student[0];

        for (int i = 0; i < student.length; i++){
            if (student[i] < min){
                min = student[i];
            }
        }
        System.out.println("The minium is: " +min);

        for (int i = 0; i < student.length; i++){
            if (student[i] > max){
                max = student[i];
            }
        }
        System.out.println("The maximum is: " +max);
    }
}
