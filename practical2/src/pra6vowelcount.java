import java.util.Scanner;

public class pra6vowelcount {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a String : ");
        String input = sc.nextLine().toLowerCase();
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i< input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'a' && ch<= 'z' ){
                if(ch == 'a' || ch=='e' || ch=='i'||ch=='o'|| ch=='u'){
                    count1++;
                }
                else {
                    count2++;
                }
            }
        }
        System.out.println("Number of vowel : "+ count1);
        System.out.println("Number of constant :"+ count2);
    }

}
