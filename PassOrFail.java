import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        int mark = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your mark below for the Java Exam:");
        mark = input.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid input for mark. Please re-enter a value between 0 and 100.");
        } else if (mark >= 50) {
            System.out.println("You have passed with the mark " + mark);
        } else {
            System.out.println("You have failed with the mark " + mark);
        }
    }
}
