import student.student;
import exam.result;
public class exp7_pakage {
    public static void main(String[] args) {
        System.out.println("student result is : ");
        student student1=new student(1,90,"Dhara");
        result r1=new result();
        r1.generateresult(student1);

    }
}
