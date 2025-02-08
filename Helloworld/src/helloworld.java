import java.util.Scanner;

class helloworld
{
    public static void main(String[] args)
    {
        System.out.print("Hello world ");// to output
        System.out.println("Hello world");
        System.out.print("Hello world \n");
        // variables
        int a = 10;
        int b = 5;
        int ans = (a * b)/(a - b);
        System.out.print(ans);
        // input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();//print only first word
        System.out.print(name);
        // print whole line : nextLine();
        // nextInt();
        //nextFloat();

        Scanner sc1 = new Scanner(System.in);
        int c = sc1.nextInt();
        int d = sc1.nextInt();
        int sum = c + d;
        System.out.print(sum);


    }
}
