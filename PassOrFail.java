import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args){
    int mark = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter your mark below for the Java Exam:");
    mark = input.nextInt();

    if (mark >=50 & mark <=100){
        System.out.println("You have passed with the mark " + mark);
    }
    else if(mark < 0 && mark >100){
        
        System.out.println("Invalid input for mark, Please re-enter mark");
        System.out.println("Please Enter your mark below for the Java Exam:");
        mark = input.nextInt();
    }
    else{
        System.out.println("you have failed with the mark " + mark);
    }

    }
    
    
}
