public class pra2equation {
    public static void main (String [] args){
        double a = 3.4 , b = 50.2 , c = 2.1 ,d = 0.55 , e = 44.5, f = 5.9;
        double determinant = a*d-b*c;
        if ( determinant == 0){
            System.out.println(" No solution ");
        }
        else {
            double x = (e*d-b*f)/determinant;
            double y = (a*f-e*c)/determinant;

            System.out.println("solution :");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }
}