import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter mark that you have got");
        int mark = input.nextInt();

        if(mark <0 || mark >100){
            System.out.println("Invalid Mark, Please re-enter the valid mark");

        }
        else if(mark <=49){
            System.out.println("You have failed the test with the mark of " + mark);
        }
        else if(mark >= 50 && mark <=69){
            System.out.println("you have passed the exam with the mark of " + mark);
        }
        else if (mark >=70 && mark <=79){
            System.out.println("You have passed and earned a merit with the mark of " + mark);
        }
        else{
            System.out.println("You have passed and got a distinction with your mark of " + mark);
        }

    }

}