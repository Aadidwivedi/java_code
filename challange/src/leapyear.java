import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Check the leap year or Not:");
        System.out.print("Enter the no of leapYear:");

        int Year = input.nextInt();

        if((Year%4==0 && Year%100 !=0) || Year%400 == 0)
        {
            System.out.println(Year +": This is leap Year.");
        }else{
            System.out.println(Year+ ":This Is not Leap Year");
        }
    }
}
