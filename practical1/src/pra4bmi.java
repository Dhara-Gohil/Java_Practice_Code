import java.util.Scanner;

public class pra4bmi {
    public static void main (String[] args){
        System.out.println("Enter your weight in pounds :");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        System.out.println("Enter your height in inches :");
        double h = sc.nextDouble();
        double bmi = (w*0.45359237)/(h*0.0254*h*0.0254);
        System.out.println("your BMI is :" + bmi);
    }
}