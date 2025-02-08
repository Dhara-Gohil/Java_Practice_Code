package student;
public class student {
    int roll_no,marks;
    String name;
    public student(int rn,int m,String n){
        roll_no=rn;
        marks=m;
        name=n;
    }
    public int getRoll_no(){
        return roll_no;
    }
    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
}
