public class exp4_arrayexception {
    public static double average(String[] array) throws NumberFormatException{
        if(array==null){
            throw new NullPointerException("Array is null !");
        }

        double sum = 0;
        int count = 0;
        for (String str : array){
            if ((str==null)){
                throw new NullPointerException("Array elements cannot be null : ");
            }
            try {
                double number = Double.parseDouble(str);
                sum+=number;
                count++;
            }
            catch (NumberFormatException e){
                System.out.println("Enter valid number format !");
            }
        }
        if (count==0){
            throw new NumberFormatException("Array does not contain any valid numbers.");
        }
        return sum/count;
    }

    public static void main(String[] args) {
        String[] number={"1","2","3","4","5"};
        try {
            double avg = average(number);
            System.out.println("Average: "+ avg);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException : Array elements cannot be null !");
        }
        catch (NumberFormatException e){
            System.out.println("change number format !");
        }
    }
}
