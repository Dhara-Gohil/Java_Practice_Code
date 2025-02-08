import java.util.Scanner;

public class pra3eleminatedup {
        public static void main(String[] args) {
            System.out.println("Enter an array to remove duplicate values:");
            Scanner sc = new Scanner(System.in);
            int[] arr1 = new int[8];
            int[] arr2 = new int[8];
            boolean isDuplicate;
            for (int i = 0; i < 8; i++) {
                arr1[i] = sc.nextInt();
            }
            int currentindex = 0;
            for (int i = 0; i < 8; i++) {
                isDuplicate = false;
                for (int j = 0; j < currentindex; j++) {
                    if (arr1[i] == arr2[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    arr2[currentindex++] = arr1[i];
                }
            }
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < currentindex; i++) {
                System.out.print(arr2[i] + " ");
            }
        }

}
