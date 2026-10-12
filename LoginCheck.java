import java.util.Scanner;
public class LoginCheck {
    public static void main(String[] args) {
        String username = "Keitu-rams";
        String password = "ilovemo";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String usName = input.nextLine();
        System.out.println("Please enter your password:");
        String pass=input.nextLine();
        if(username.equals(usName) && password.equals(pass)){
            System.out.println("You have logged in successfully into your account");
        }
        else{
            System.out.println("Invalid credentials used");
        }

    }
}
