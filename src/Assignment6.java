import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Months();
    }
        public static void Months(){
        int month=1;
        int day;
        while(month<13){
            day=1;
            while(day<31){
                System.out.println(month+"/"+day+"/"+"2020");
                day++;
            }
            month++;
        }
    }
}
