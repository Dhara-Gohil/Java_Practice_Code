import java.util.Scanner;

public class pra6vowelorconstant {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
            System.out.println(ch + " is vowel !");
        }
        else if ((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch<= 'Z')) {
            System.out.println(ch + "is constant !");
        }
        else {
            System.out.println("not alphabet");
        }
    }
}