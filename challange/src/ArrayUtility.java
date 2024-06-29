import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the numbers of elements:");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("please enter element" + (i + 1) + ":");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }

    public static void displayArray(int[] numArry){
        int i = 0;
        while(i<numArry.length){
            System.out.print(numArry[i] + " ");
            i++;
        }
        System.out.println();
    }
}
