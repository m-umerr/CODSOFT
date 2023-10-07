import java.util.*;
import java.lang.*;

public class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        int total_marks=0;
        double average_percent=0.0;

        System.out.println("Student Grade Calculator");
        for(int i=0; i<5; i++) {
            System.out.println("Enter marks in Subject " + (i+1) + ":" );
            marks[i] = sc.nextInt();
            if((marks[i] > 100) || (marks[i] < 0)){
                System.out.println("Enter marks within range [0-100]" );
                System.exit(1);
            }
            total_marks+=marks[i];
        }
        System.out.println("Total marks: " + total_marks);
        average_percent = total_marks/5.0;
        System.out.println("Average Percentage: " + average_percent);

        if(average_percent < 50){
            System.out.println("Your Grade is F");
        } else if((average_percent >= 50) && (average_percent < 62)){
            System.out.println("Your Grade is D");
        } else if((average_percent >= 62) && (average_percent < 74)){
            System.out.println("Your Grade is C");
        } else if((average_percent >= 74) && (average_percent < 85)){
            System.out.println("Your Grade is B");
        } else if((average_percent >= 85) && (average_percent < 100)){
            System.out.println("Your Grade is A");
        }
    }
}