import java.util.Scanner;

public class methods {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        String name = sc.next();

        PrintMyName(name);//function call.
    }
    public static void PrintMyName (String name){
        System.out.println(name);
        return;
    }
}
