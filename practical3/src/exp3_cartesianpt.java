class cartesianpt {
   int x,y;
   public int getX() {
      return x;
   }
   public int getY() {
      return y;
   }

   void move(int a,int b){
      x=a;
      y=b;
   }
   void move(int c){
      x=c;
      y=c;
   }

   void display (){
      System.out.println("value of X : "+x+" value of Y : "+y);
   }
}
public class exp3_cartesianpt {
   public static void main(String[] args) {
      System.out.println("different cartesian points :");
      cartesianpt point1 = new cartesianpt();
      point1.move(3,4);
      System.out.println("point 1 : " + point1.getX() + " , " + point1.getY());
      point1.display();
      point1.move(3);
      System.out.println("point 2 : " +  point1.getX() + " , " + point1.getY());
      point1.display();
      point1.move(6,7);
      System.out.println("point 3 : " +  point1.getX() + " , " + point1.getY());
      point1.display();
      point1.move(9);
      System.out.println("point 4 : " +  point1.getX() + " , " + point1.getY());
      point1.display();
   }
}