class employee {
    int dep_id;
    String name;
    double salary;
}
class engdept extends employee{
    engdept(int d, String s, double b ){
        dep_id=d;
        name=s;
        salary=b;
    }
    void display(){
        System.out.println("employee department : "+dep_id);
        System.out.println("employee Name : "+name);
        System.out.println("employee Salary : "+salary);
    }
}
class meddept extends employee{
    meddept(int d,String s, double b){
        dep_id=d;
        name=s;
        salary=b;
    }
    void display(){
        System.out.println("employee department : "+dep_id);
        System.out.println("employee Name : "+name);
        System.out.println("employee Salary : "+salary);
    }
}
public class exp5_employee {
    public static void main(String[] args) {
        System.out.println("Employee data of engineering department : ");
        System.out.println();
        engdept e1 = new engdept(1,"Meet Gohil",100000);
        engdept e2 = new engdept(1,"Karan Gohil",100000);
        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        System.out.println("Employee data of Medical department : ");
        System.out.println();
        meddept m1 = new meddept(2,"Hitesh Gohil",50000);
        meddept m2 = new meddept(2,"Bhavik Gohil",50000);
        m1.display();
        System.out.println();
        m2.display();
    }
}