class IllegalMarkException extends Exception{
    public IllegalMarkException (String message){
        System.out.println("Illegal marks");
    }
}
class result{
    int reg_no;
    int marks;
    result(int reg_no,int marks){
        this.marks=marks;
        this.reg_no=reg_no;
    }
}
public class exp6_marklist {
    public static void main(String[] args) {
        result maths = new result(1,44);
        result phy = new result(2,56);
        result che = new result(3,33);
        System.out.print("Reg.no ");
        System.out.println(" Student's result ");
        if(maths.marks>=40){
            System.out.println(maths.reg_no+"     pass in maths");
        }
        else {
            System.out.println(maths.reg_no+"     fail");
        }
        if(phy.marks>=40){
            System.out.println(phy.reg_no+"     pass in physics");
        }
        else {
            System.out.println(phy.reg_no+"     fail");
        }
        if(che.marks>=40){
            System.out.println(che.reg_no+"     pass in chemistry");
        }
        else {
            System.out.println(che.reg_no+"     fail");
        }
        try {
            if (maths.marks <= 0) {
                throw new IllegalMarkException("Illegal marks");
            } if (phy.marks <= 0) {
                throw new IllegalMarkException("Illegal marks");
            } if (che.marks <= 0) {
                throw new IllegalMarkException("Illegal marks");
            }
        }
        catch(IllegalMarkException e){
            System.out.println(e);
        }
    }
}
