public class Assignment7 {
    public static void main(String[] args) {
        PrintWithFor();
    }
    public static void PrintWithFor() {
        for (int i = 1; i < 26; ) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "\t");
                i++;
            }
            System.out.println();
        }
    }
}
