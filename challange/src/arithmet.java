import java.util.Scanner;

public class arithmet {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic calculator.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two no A and B ");
        System.out.print("Enter the first of A:");
        int first= input.nextInt();
        System.out.print("Enter the second no of B:");
        int second = input.nextInt();
        int sum = first + second;
        int sub = first - second;
        int mul = first*second;
        int div = first / second;
        int mod = first%second;
        System.out.println("sum:"+sum);
        System.out.println("sub:"+sub);
        System.out.println("mul:"+mul);
        System.out.println("div:"+div);
        System.out.println("mod:"+mod);

    }
}
