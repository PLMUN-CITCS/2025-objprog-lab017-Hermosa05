import java.util.Scanner;

public class GradeCalculator {

    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return score;
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        double studentScore = getStudentScore();
        String studentGrade = calculateGrade(studentScore);
        System.out.println("Your Grade is: " + studentGrade);
    }
}