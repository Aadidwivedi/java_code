import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR Operator:/n");
        System.out.print("Enter the first num1:");
        int num1 = input.nextInt();

        System.out.print("Enter the Second num2:");
        int num2 = input.nextInt();

        int result = num1 ^ num2;

        System.out.println("Bitwise XOR number is :"+ result);
    }
}
