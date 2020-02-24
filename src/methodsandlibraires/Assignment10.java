package methodsandlibraires;
import java.util.Scanner;
public class Assignment10 {
    public static void main(String[] args) {
       Palindrome();
    }

    public static void Palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.next();
        if (input.equals("madam")) {
        } else {
            System.out.println("Not palindrome");
        }
        for (int i = (input.length() - 1); i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}

