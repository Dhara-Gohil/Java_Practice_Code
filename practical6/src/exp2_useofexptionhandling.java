import java.util.Scanner;

public class exp2_useofexptionhandling {
    public static double division (double x,double y)throws ArithmeticException{
        return x/y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for division : \n"+"value of x :");
        double x = sc.nextDouble();
        System.out.println("value of y :");
        double y = sc.nextDouble();
        try {
            if(x<0){
                throw new IllegalArgumentException("Enter positive Number : ");
            }
            if(y==0){
                throw new ArithmeticException("Enter valid divisor !");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal argument exception "+e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception : "+e.getMessage());
        }
        try {
            double ans = division(x,y);
            System.out.println("ans = "+ ans);
        }
        catch (ArithmeticException | IllegalArgumentException e){
            System.out.println("exception occurs !");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Program Finishes !");
        }
    }
}