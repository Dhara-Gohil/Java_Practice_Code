import java.util.Scanner;
public class pra4twoDmatrixopration {
        public static void main(String[] args) {
            System.out.println("enter a first matrixe value row by row");
            Scanner sc=new Scanner(System.in);
            int [][] matrix1=new int [3][3];
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    matrix1[i][j]= sc.nextInt();
                }
            }
            System.out.println("first matrix is:");
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    System.out.print(matrix1[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("enter a second matrix:");
            int [][] matrix2=new int [3][3];
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    matrix2[i][j]= sc.nextInt();
                }
            }
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    System.out.print(matrix1[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println("enter a oprator + or - or * :");
            char op=sc.next().charAt(0);
            if(op=='+' || op=='-'||op=='*'){
                System.out.println(op);
            }else {
                System.out.println("enter a valid opartor");

            }
            if(op=='+'){
                int [][] matrix3=new int [3][3];
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        matrix3[i][j]=matrix2[i][j] + matrix1[i][j];
                    }
                }
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        System.out.print(matrix3[i][j]+ " ");
                    }
                    System.out.println();
                }

            } else if (op=='-') {
                int [][] matrix4=new int [3][3];
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        matrix4[i][j]=matrix2[i][j] - matrix1[i][j];
                    }
                }
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        System.out.print(matrix4[i][j]+ " ");
                    }
                    System.out.println();
                }

            } else if (op=='*') {
                int [][]matrix5=new int[3][3];
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        for(int k=0;k<=2;k++){
                            matrix5[i][j]+=matrix1[i][k]*matrix2[k][j];
                        }

                    }
                }
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        System.out.print(matrix5[i][j]+ " ");
                    }
                    System.out.println();

                }


            }

        }
}
