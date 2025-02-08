import java.util.Scanner;

public class exp1_exceptionfordivi {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter value of divisor : ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int d=3000;
        try {
            int ans = d/a;
        }
        catch (Exception e){
            System.out.println("Exception : "+e);
        }
    }
}
