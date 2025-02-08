import java.util.Scanner;

public class exp3_bank {
    static double deposit=1000.00;
    static double amount;
    public static void main(String[] args) {

        try{
            for (int i=0; i<3;i++){
                System.out.println("Enter amount to withdraw money : ");
                Scanner sc = new Scanner(System.in);
                amount=sc.nextDouble();
            }
            try {
                if(deposit<amount);
                {
                    throw new ArithmeticException("No sufficient amount : ");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static double withdraw(double amount){
        deposit-=amount;
        System.out.println("Current balance : "+deposit);
        return deposit;
    }
}
