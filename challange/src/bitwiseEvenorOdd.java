import java.util.Scanner;

public class bitwiseEvenorOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To bitwise Even or Odd No:");
        System.out.print("Enter the no :");

        int num = input.nextInt();

        int result = num & 1;

        if(result == 0){
            System.out.println("This no is Even :"+num);
        }else{
            System.out.println("This no is ODD :"+num);

        }
    }
}
