import java.util.Scanner;
public class pra7stringprefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first string:");
        String s1=sc.next();
        System.out.println("enter a second string:");
        String s2=sc.next();
        int minLength = Math.min(s1.length(), s2.length());
        for(int i=0;i<minLength;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                System.out.print(s1.charAt(i));
                    if(s1.charAt(i)!=s2.charAt(i)){
                        break;
                    }
                }
            }
        }
}
