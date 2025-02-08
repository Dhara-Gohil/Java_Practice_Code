import java.util.Scanner;

public class swichstate {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            case 2: System.out.println("Namste");
            case 3: System.out.println("Hello Namste");
            default:System.out.println("byeeee!");
    }

    }
}
