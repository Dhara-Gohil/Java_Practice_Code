package exam;
import student.student;
public class result {
    public void generateresult(student student){
        System.out.println("roll number : "+student.getRoll_no());
        System.out.println("name : "+student.getName());
        System.out.println("marks : "+student.getMarks());
    }
}
