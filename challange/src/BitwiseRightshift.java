import java.util.Scanner;

public class BitwiseRightshift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise LeftShift Operator:/n");
        System.out.print("Enter the first num1:");
        int num1 = input.nextInt();

        System.out.print("Enter the Second num2 shifting Digit:");
        int num2 = input.nextInt();


        int result = num1>>num2;

        System.out.println("Bitwise LeftShift number is :"+ result);
    }
}
