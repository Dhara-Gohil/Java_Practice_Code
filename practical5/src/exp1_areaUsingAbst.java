import java.util.Scanner;

abstract class shape{
    double length,width,radius;
    shape(double length,double width){
        this.length=length;
        this.width=width;
    }
    shape(double radius){
        this.radius=radius;
    }
    abstract void area();
}
class Triangle extends shape{
    Triangle(double length, double width){
        super(length,width);
    }
    @Override
    public void area(){
        System.out.println("Area of triangle : "+0.5*length*width);
    }
}
class Rectangle extends shape{
    Rectangle(double length , double width){
        super(length,width);
    }
    @Override
    public void area(){
        System.out.println("Area of triangle : "+length*width);
    }
}
class Circle extends shape{
    Circle(double radius){
        super(radius);
    }
    @Override
    public void area(){
        System.out.println("Area of triangle : "+3.14*radius*radius);
    }
}
public class exp1_areaUsingAbst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose any one for area : ");
        System.out.println("1 Triangle");
        System.out.println("2 Rectangle");
        System.out.println("3 Circle");
        int choice;
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("For triangle enter length and height :");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                Triangle t1 = new Triangle(l,w);
                t1.area();
                break;
            case 2:
                System.out.println("For Rectangle enter length and width :");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                Rectangle r1 = new Rectangle(a,b);
                r1.area();
                break;
            case 3:
                System.out.println("For circle enter radius :");
                double r = sc.nextDouble();
                Circle c1 = new Circle(r);
                c1.area();
                break;
            default:
                System.out.println("choose any one");
                break;
        }
    }
}
