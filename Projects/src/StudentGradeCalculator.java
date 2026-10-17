
import java.util.Scanner;
public class StudentGradeCalculator {
    public static double calculateAverage(int[] marks){
        int total = 0;
        for(int mark : marks){
            total += mark;
        }

        return (double) total / marks.length;
    }

    public static char calculateGrade(double average){
        if(average >= 90){
            return 'A';
        }
        else if(average >= 75){
            return 'B';
        }
        else if(average >= 60){
            return 'C';
        }
        else if(average >= 40){
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        for(int i=0;i<marks.length;i++){
            System.out.println("Enter marks for subject " + (i+1) + " (0-100)");

            if(!sc.hasNextInt()){
                System.out.println("Invalid input. Enter integer marks: ");
                sc.close();
                return;
            }
            marks[i] = sc.nextInt();
        }

        double average = calculateAverage(marks);
        char grade = calculateGrade(average);

        System.out.println("\n===== Student Result =====");
        System.out.println("Name: "+ name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println(average >= 40 ? "Result: Pass" : "Result: Fail" );

        sc.close();
    }
}
