import java.util.Scanner;

public class StudentGradeCalculator
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int subjects = scanner.nextInt();
        int mark;
        int sum = 0;
        
        for (int i = 1; i <= subjects; i++)
        {
           
            do
            {
                System.out.println("Enter Subject "+i+ " mark (0 - 100):");
                mark = scanner.nextInt();
                if (mark < 0 || mark > 100)
                    System.out.print("Invalid mark. \nPlease enter valid mark.");
            } while (mark < 0 || mark > 100);
            sum += mark;
        }

        float average = (float) sum / subjects;
        char grade;

        if (average > 90)
            grade = 'A';
        else if (average > 80)
            grade = 'B';
        else if (average > 70)
            grade = 'C';
        else if (average > 60)
            grade = 'D';
        else if (average > 50)
            grade = 'E';
        else
            grade = 'F';
        
        System.out.println("Total Marks : " +sum);
        System.out.println("Average Percentage : " +average);
        System.out.println("Grade : " +grade);
    }
}