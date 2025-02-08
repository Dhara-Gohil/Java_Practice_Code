import java.util.Scanner;

class employee{
  private String name;
  private int salary;
  public void getdata(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name of Employee : ");
      name=sc.nextLine();
      System.out.println("Enter salary of Employee : ");
      salary=sc.nextInt();
  }
  public void putdata(){
      System.out.println("Name : " + name);
      System.out.println("Salary : " + salary);

  }
}
public class exp4_employeedata {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.getdata();
        e1.putdata();
        employee e2 = new employee();
        e2.getdata();
        e2.putdata();

    }
}
