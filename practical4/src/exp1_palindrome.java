public class exp1_palindrome {
    public static void main(String[] args) {
        System.out.println("5 Worlds as string : ");

        for(int i=0; i<5; i++){
            System.out.println(args[i]);
        }
        System.out.println();
        // To reverse String :
        System.out.println("After reverse words : ");
        String reverse;

        // reverse string chhe ae aek aek element leshe array mathi and ae aek aek pr j process karshe..!!
        for (String arg : args) {
            reverse = arg;
            for (int j = reverse.length() - 1; j >= 0; j--) {
                System.out.print(reverse.charAt(j));
            }
            System.out.println();
            if (isPalindrome(reverse)){
                System.out.println("palindrome !");
            }
            else {
                System.out.println("Not palindrome !");
            }
            System.out.println();
        }
        System.out.println();
        }

    // To check palindrome or not :
        public static boolean isPalindrome(String reverse){
        int left=0,right=reverse.length()-1;
        while (left<right){
            if(reverse.charAt(left)!=reverse.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
