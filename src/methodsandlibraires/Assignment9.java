package methodsandlibraires;
public class Assignment9 {
    public static void main(String[] args) {
        Reverse("abc");
        RevNumbers("123");
    }

    public static void Reverse(String text) {
        String input = "abc";
        for (int i = (input.length() - 1); i >= 0; i--) {
            System.out.println(input.charAt(i));
        }
    }

    public static void RevNumbers(String text) {
        String input = "123";
        for (int i = (input.length() - 1); i >= 0; i--) {
            System.out.println(input.charAt(i));
        }
    }
}

