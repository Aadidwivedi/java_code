import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate prime Number:");
        System.out.print("Please! Enter the Number:");
        int num= input.nextInt();
        boolean isPrime = isPrime(num);
            if(isPrime){
                System.out.println(num + " :is prime");
            }else{
                System.out.println(num + " :is not prime");
            }

    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0) {
                return false;
            }
            i++;
        }
            return true;
    }
}
