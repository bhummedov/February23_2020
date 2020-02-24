import java.util.Scanner;
public class Assignement5 {
    public static void main(String[] args) {
        Guess();
    }
    public static void Guess(){
        Scanner in = new Scanner(System.in);
        int number = 55;
        int guess= 0;
        while (guess!=number){
            System.out.println("enter number 0-100 : ");
            guess = in.nextInt();
            if (guess<number){
                System.out.println("bigger");
            }else if(guess>number){
                System.out.println("smaller");
            }else {
                System.out.println("done");
            }
        }
    }
}
