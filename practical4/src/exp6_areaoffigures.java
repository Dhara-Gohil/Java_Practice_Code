class shape{
    double length,width;
    public double getLength(){return length;}
    public double getWidth(){return width;}

    void display_area(double l,double w){
        System.out.println("Area is :"+0.0);
    }
}
class triangle extends shape{
    void display_area(double length,double width){

        System.out.println("Area of triangle is : "+0.5*length+width);
    }
}
class rectangle extends shape {
    @Override
    void display_area(double length, double width) {

        System.out.println("Area of rectangle is : "+length*width);
    }
}
public class exp6_areaoffigures {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.display_area(6,9);
        rectangle r1 = new rectangle();
        r1.display_area(7,8);
    }
}
