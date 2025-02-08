import java.util.Scanner;

public class pra8password {
    public static void main (String[] args){
        System.out.print("Create password : ");
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        int count = 1;
        int count1 = 0;
        for (int i =1; i< pass.length(); i++) {
            count++;
        }
        if(count>=8) {
            for (int j = 0; j < pass.length(); j++) {
                if ((pass.charAt(j)>='a' && pass.charAt(j)<='z')||(pass.charAt(j)>='A' && pass.charAt(j)<='Z'||(pass.charAt(j)>='0') && (pass.charAt(j)<='9'))){
                   if((pass.charAt(j)>='0' && pass.charAt(j)<='9')) {
                       count1++;
                   }
                }
                else {
                    System.out.println("invalid");
                    return;
                }
            }
            if(count1>=2){
                System.out.println(pass);
            }
            else {
                System.out.println("invalid");
            }
        }
        else{
            System.out.println("invalid");
        }
    }
}