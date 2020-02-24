package methodsandlibraries;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        printNumber();
        ASCII();
        up();
        lower();
    }

    public static void printNumber() {
        for (int i = 100; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void ASCII() {
        for (int j = 0; j < 256; j++) {
            System.out.println((char) j);
        }
    }

    public static void lower() {
        for (int k = 97; k < 122; k++) {
            System.out.println((char) k);
        }
    }

    public static void up() {
        for (int a = 65; a < 90; a++) {
            System.out.println((char) a);
        }
    }
}

