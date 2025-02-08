import java.util.Scanner;

public class pra9areaoftriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the lengths of the three sides of the triangle:");
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
            // Calculate the semi-perimeter
            double semiPerimeter = (side1 + side2 + side3) / 2;
            // Calculate the area using Heron's formula
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
            System.out.println("The area of the triangle is: " + area);
        }
}
