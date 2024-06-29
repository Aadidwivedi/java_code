import java.util.Scanner;

public class multipliction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two no for user input:\n\n");
        System.out.print("Please Enter the first decimal no:");
        double firstNumber = input.nextDouble();
        System.out.print("Please Enter the Second decimal  no: ");
        double secondNumber = input.nextDouble();
        //double mul= firstNumber*secondNumber;

        System.out.println(" Multipl ication: "+ firstNumber*secondNumber);



    }
}
