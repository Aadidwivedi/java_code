import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise NOT/Complement Operator:/n");
        System.out.print("Enter the first num1:");
        int num1 = input.nextInt();
        int result = ~num1;

        System.out.println("BitwiseNOT/ Complement number is :"+ result);
    }
}
