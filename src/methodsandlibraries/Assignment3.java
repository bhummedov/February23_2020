package methodsandlibraries;
import java.util.Scanner;
public class Assignment3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input("Hello");
        isInput("Hello");
    }
   public static void input(String input){
        for (int i=0; i<input.length(); i++)
        System.out.println(input.charAt(i));

    }
public static void isInput(String name) {
    boolean result;
    String input = "Hello";
    for (int i=0; i<input.length(); i++)
        System.out.println(input.charAt(i));
        result =true;
    }
}
