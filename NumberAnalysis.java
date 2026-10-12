import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int num = input.nextInt();

        if(num > 0){
            System.out.println(num + " entered is a positive number");
        }
        else if (num < 0){
            System.out.println(num + " entered is a negative number");
        }
        else {
            System.out.println(num + " number is a zero");
        }

        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }


    }
}
