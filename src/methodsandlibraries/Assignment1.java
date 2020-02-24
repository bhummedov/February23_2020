package methodsandlibraries;
public class Assignment1 {
    public static void main(String[] args){
        System.out.println("Berdi");
        printMyName();
        printMyName2("It is always fun");
        System.out.println(printMyName3());
        System.out.println(printMyName4("So u are also in love with Java"));
    }
public static void printMyName(){
    System.out.println("Yes sure");
}
public static void printMyName2(String name){
    System.out.println(name);
    }
    public static String printMyName3(){
        return "0 yeah I love Java too";
    }
    public static String printMyName4(String name){
        return name;
    }
}