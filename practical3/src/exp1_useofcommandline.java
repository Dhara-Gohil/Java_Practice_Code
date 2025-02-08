public class exp1_useofcommandline {
    public static void main(String[] args) {
        System.out.println("use of command line : ");
        for (int i=0; i<3; i++){
            System.out.println("student "+ (i+1) + " " +args[i]);
        }
    }
}
