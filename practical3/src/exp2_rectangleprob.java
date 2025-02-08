public class exp2_rectangleprob {
    static class rectangle {
        double height;
        double width;
        rectangle(){
            height = 1;
            width = 1;
            System.out.println("Both height and width are 1 :");
        }
        rectangle(double h, double w){
            height=h;
            width=w;
            System.out.println("height of rectangle " + h);
            System.out.println("width of rectangle " + w);
        }
        public double getarea (){
            return height*width;
        }
        public double getperimeter (){
            return 2 * (height + width);
        }
    }

    public static void main(String[] args) {
        System.out.println("Rectangle problems : ");
        System.out.println();
        System.out.println("1st rectangle's area and perimeter : ");
        rectangle rec1 = new rectangle(40 , 4 );
        double area;
        double perimeter;
        area = rec1.getarea();
        perimeter = rec1.getperimeter();
        System.out.println( "Area " + area + " " + " Perimeter " + perimeter);

        System.out.println();

        System.out.println("2nd rectangle's area and perimeter : ");
        rectangle rec2 = new rectangle(35.9 , 3.5);
        area = rec2.getarea();
        perimeter = rec2.getperimeter();
        System.out.println( "Area " + area + " " + " Perimeter " + perimeter);

        System.out.println();

        System.out.println("3rd rectangle's area and perimeter : ");
        rectangle rec3 = new rectangle();
        area = rec3.getarea();
        perimeter = rec3.getperimeter();
        System.out.println( "Area " + area + " " + " Perimeter " + perimeter);

    }
}
