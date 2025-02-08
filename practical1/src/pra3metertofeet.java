import java.util.Scanner;

public class pra3metertofeet {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double f = m * 3.28084;
        System.out.println(f);
    }
}