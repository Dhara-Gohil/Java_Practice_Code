import java.util.Scanner;

public class pra1matrixgenrate {
       public static void main (String[] args){
           int [][] matrix = new int[6][6];
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter value for matrix : ");
           System.out.println("Enter '0' or '1' ! ");

           for(int i=0; i<6; i++) {
               for (int j=0; j<6; j++) {
                   matrix[i][j] = sc.nextInt();
                   if(matrix[i][j] != 0 && matrix[i][j] != 1) {
                       System.out.println("enter valid number");
                       return;
                   }
               }

           }
           for(int i=0; i<6; i++) {
               for (int j=0; j<6; j++) {
                   System.out.print(matrix[i][j] + " ");
               }
               System.out.println();
           }
           int countfor1 = 0;
           int countfor0 = 0;
           for(int i=0; i<6; i++){
               for(int j=0; j<6; j++) {
                   if(matrix[i][j]== 1) {
                       countfor1++;
                   }
                   else
                       countfor0++;
               }

           }
           System.out.println("total 0s are : " + countfor0);
           System.out.println("total 1s are : " + countfor1);

       }
}