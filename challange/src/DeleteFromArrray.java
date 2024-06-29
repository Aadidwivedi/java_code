import java.util.Scanner;

public class DeleteFromArrray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Delation");

        int[] numArray = ArrayUtility.inputArray();

        System.out.print("Please! Enter the element Which do you want to delete: ");

        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArray,numToDelete);
        ArrayUtility.displayArray(newArr);


    }

    public static int[] deleteNumber(int[] numArray,int numToDelete ){
        int occ = OccurrencesArray.noOfOccurrences(numArray,numToDelete);
        if(occ == 0){
            return numArray;
        }
        int newSize = numArray.length -occ;
        int[] newArr = new int[newSize];

        int i=0,j=0;
        while(i < numArray.length){
            if(numArray[i] != numToDelete){
              newArr[j] = numArray[i];
              j++;
            }
            i++;
        }
        return newArr;
    }
}
