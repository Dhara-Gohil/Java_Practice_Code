import java.util.Scanner;
class account{
    int id;
    double balance;
    String name;
    account(){
        id=0;
        balance=0;
        name="none";
    }
    public account (String a, int b, double c) {
        name=a;
        id=b;
        balance=c;
    }
    public boolean search (int searchid){
        return id == searchid;
    }
    public void display(){
        System.out.println("Name : " + name );
        System.out.println("id : " + id );
        System.out.println("Balance : " + balance);
    }
}
public class exp7_dis_account_details {
    public static void main(String[] args) {
        account a1 = new account();
        System.out.println("Enter value like this : ");
        a1.display();
        account[] a = new account[5];
        String n; double b; int id;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter name of : " + (i+1));
            n=sc.next();
            System.out.println("Enter id of : " + (i+1));
            id=sc.nextInt();
            System.out.println("Enter balance of : " + (i+1));
            b= sc.nextDouble();
            a[i]=new account(n,id,b);
        }
        for(account ac:a){
            ac.display();
            System.out.println();
        }
        System.out.println("To search any account by id : ");
        int searchid = sc.nextInt();
        for(account ac:a){
            if(ac.search(searchid)){
                System.out.println("Account Exist : ");
                ac.display();
                break;
            }
        }
    }
}
