interface exam{
    boolean pass(int mark);
}
interface classify{
    int division(int average);
}
class result implements exam,classify{
    public boolean pass (int mark) {
        boolean is_pass ;
        if(mark >= 50){
            is_pass=true;
        }
        else is_pass=false;

        if(is_pass){
            System.out.println("pass !");
        }
        else System.out.println("fail !");

        return is_pass;
    }
    public int division (int average){
        if (average>=60){
            System.out.println("first !");
        }

        if(average>=50 && average<60){
            System.out.println("Second");
        }
        if(average<50){
            System.out.println("No division");
        }
        return 0;
    }

}
public class exp3_examprobusinginterface {
    public static void main(String[] args) {
        result r1 = new result();
        r1.pass(90);
        System.out.print("Division is : ");
        r1.division(80);
    }
}
