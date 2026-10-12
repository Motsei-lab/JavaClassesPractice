import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees in Celcsius:");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("you have entered the temp: " + celsius + " in celsius and when it is converted to fahrenheit is: " + fahrenheit);

        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter degrees in fahrenheit:");
        double fah = inputs.nextDouble();
        double cel = (fah - 32) * 5/9;
        System.out.println("You have entered the temp: " + fah + " in fahrenheit and when it is convereted to celsius is: " + cel);
    }
}
