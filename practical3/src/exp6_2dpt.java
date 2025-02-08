import java.util.Scanner;

class point{
    int x,y;
    point(){
      x=5;
      y=5;
    }
    point(int a, int b){
        x=a;
        y=b;
    }
     public void display(){
         System.out.println("Point is : "+ x +" " + y);
     }
}
public class exp6_2dpt {
    public static void main(String[] args) {
        point p1 = new point();
        System.out.println("Default value of point : ");
        p1.display();
        System.out.println("value from user : ");
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter value of x :");
        a=sc.nextInt();
        System.out.println("Enter value of y :");
        b= sc.nextInt();
        point p2 = new point(a,b);
        p2.display();
    }
}
