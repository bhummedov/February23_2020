package methodsandlibraries;
import java.util.Scanner;
public class Assignment2 {
    public static String charArt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input for password :");
        String input = scanner.nextLine();
        if (input.length() < 6) {
            System.out.println("Not Ok");
        } else {
            System.out.println("Ok");

        }
        return "abcdef";
    }

    public static void main(String[] args) {
        charArt();
        isPassword("ok");
    }

    public static boolean isPassword(String name) {
        boolean result;
        String password = "ghihkl";
        if (password.length() < 6) {
            result = false;
        } else {
            result= true;
        }
        return result;
    }
}