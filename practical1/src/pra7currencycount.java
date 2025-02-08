import java.util.Scanner;

public class pra7currencycount {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount : ");
         int amount = sc.nextInt();

         int[] denominations = {100,50,10,5,2,1};
         int[] notescount = new int[6];

         for (int i = 0; i< denominations.length; i++){
             if (amount >= denominations[i]){
                 notescount[i] = amount/denominations[i];
                 amount%= denominations[i];
             }
         }
        System.out.println("currency breakdown : ");
         for (int i = 0; i< denominations.length; i++){
             System.out.println(denominations[i] + " : " + notescount[i]);
         }
    }
}
