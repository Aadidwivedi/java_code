import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check no is Odd Or Even:");
        System.out.print("Enter the num:");

        int num= input.nextInt();

        if (num % 2 == 0) {
            System.out.println("This no is Even="+num);
        }else{
            System.out.println("This no is Odd="+ num);
        }
    }
}
