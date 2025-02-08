import java.util.Scanner;
public class pra5selectionsort {
    public static void main(String[] args){
        System.out.println("Enter an array : ");
        int[] array = new int[8];
        Scanner sc = new Scanner(System.in);
        for(int i=0;  i<8; i++ ){
            array[i]= sc.nextInt();
        }
        System.out.println("Array elements : ");
        for(int i =0; i<8; i++){
            System.out.print( array[i]+ " " );
        }
        System.out.println();
        selectionsort(array);
        System.out.println("Array after use of selection sort : ");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] +" ");
        }
    }
    public static void selectionsort(int[] arr){
        int n =arr.length;
        for(int i=0; i<n-1;i++){
            int firstindex= i;
            for(int j=i+1; j<n; j++){
                if (arr[j] < arr[firstindex]) {
                    firstindex=j;
                }
            }
            swap(arr,i,firstindex);
        }
    }
    public static void swap(int[]arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}