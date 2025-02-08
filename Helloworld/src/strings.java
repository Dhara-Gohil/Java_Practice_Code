import java.util.Scanner;

public class strings {
    public static void main (String [] args){
        //string declaration.
        String name = "Dhara";
        String Fullname = "Dhara Gohil";
        System.out.println( name +  Fullname );
        // input from user.
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("My name is :"+ name1);
        // diff functions
        //concatenation
        String firstname = "Dhara";
        String lastname = "gohil";
        String name2 = firstname + lastname;
        System.out.println(name2);
        System.out.println(name2.length());
        //charAt
        for (int i=0; i<name2.length(); i++){
            System.out.println(name2.charAt(i));
        }
        //compare.
        if (name2.compareTo(name1)==0){
            System.out.println("String are equal");
        }
        else {
            System.out.println("strings are not equal");
        }

    }
}
