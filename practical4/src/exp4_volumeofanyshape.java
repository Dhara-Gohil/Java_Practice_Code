import java.util.Scanner;

public class exp4_volumeofanyshape {
   static class volume{
        public double volume(double length){
            System.out.print("volume of Square is : ");
            return length*length*length;
        }
        public double volume(double length, double width,double height){
            System.out.print("volume of rectangle is : ");
            return length*width*height;
        }
        public double volume(double radius,String shape){
            if(shape.equalsIgnoreCase("sphere")){
                System.out.print("volume of sphere is : ");
                return (4/3*3.14*radius*radius);
            }else {
                return 0.0;
            }
        }
    }
        public static void main(String[] args) {
            volume v1 = new volume();
            Scanner sc = new Scanner(System.in);
            int choice=0;
            System.out.println("""
                    choose any one to find volume :\s
                    1 square\s
                    2 rectangle\s
                    3 sphere :""");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("You choose square");
                    System.out.print("enter length : ");
                    double l1= sc.nextDouble();
                    double square = v1.volume(l1);
                    System.out.println(square);
                    break;
                case 2:
                    System.out.println("You choose square");
                    System.out.print("enter length : ");
                    double l2= sc.nextDouble();
                    System.out.print("enter width : ");
                    double w2= sc.nextDouble();
                    System.out.print("enter width : ");
                    double h2= sc.nextDouble();
                    double rectangle = v1.volume(l2,w2,h2);
                    System.out.println(rectangle);
                    break;
                case 3:
                    System.out.println("You choose square");
                    System.out.print("enter radius : ");
                    double r1= sc.nextDouble();
                    double triangle = v1.volume(r1,"sphere");
                    System.out.println(triangle);
                    break;
            }
        }


}
