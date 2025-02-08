import java.util.Scanner;

class area{
    public double area (double length){
        System.out.print("Area of Square is : ");
        return length*length;
    }
    public double area (double length, double width){
        System.out.print("Area of rectangle is : ");
        return length*width;
    }
    public double area(double length, double height,String shape){
        if(shape.equalsIgnoreCase("triangle")){
            System.out.print("Area of Triangle is : ");
            return (0.5*height*length);
        }else {
            return 0.0;
        }
    }
}
public class exp3_areaofanyshape {
    public static void main(String[] args) {
        area a1 = new area();
        Scanner sc = new Scanner(System.in);
        int choice=0;
        System.out.println("choose any one : \n"+"1 square \n"+"2 rectangle \n"+"3 triangle :");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("You choose square");
                System.out.print("enter length : ");
                double l1= sc.nextDouble();
                double square = a1.area(l1);
                System.out.println(square);
                break;
            case 2:
                System.out.println("You choose square");
                System.out.print("enter length : ");
                double l2= sc.nextDouble();
                System.out.print("enter width : ");
                double w2= sc.nextDouble();
                double rectangle = a1.area(l2,w2);
                System.out.println(rectangle);
                break;
            case 3:
                System.out.println("You choose square");
                System.out.println("enter length : ");
                double l3= sc.nextDouble();
                System.out.print("enter height : ");
                double h3= sc.nextDouble();
                double triangle = a1.area(l3,h3,"triangle");
                System.out.println(triangle);
                break;
        }
    }
}
