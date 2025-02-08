public class exp5_customException {
    public static void main(String[] args) {
        class customException extends Exception{
            public customException(String  message){super(message);}
        }
        int first = Integer.parseInt(args[0]);
        try {
            if(args==null){
                throw new ArrayStoreException("Enter command line arguments !");
            }
            if (first==0){
                throw new customException("Enter argument which does not have first number is zero !");
            }
        }
        catch (ArrayStoreException | customException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
