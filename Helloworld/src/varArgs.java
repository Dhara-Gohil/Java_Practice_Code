public class varArgs {
    static int sum (int ...arr){
       // available  int [] arr
        int result=0;
       for (int a:arr){
           result += a;
       }
       return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varArgs tutorial..!");
        System.out.println("the sum of " + sum(3,4));
        System.out.println("the sum of " + sum(3,4,5));
        System.out.println("the sum of " + sum(3,4,5,6));
        System.out.println("the sum of " + sum(3,4,5,6,7));
    }
}
