import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Print the Armstrong Number:");
        System.out.print("Please enter the Number");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");
        }else{
            System.out.println("Your no is not Armstrong:");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfdigits = noOfDigits(num);
        int numCopey = num;
        System.out.println("No Of digits"+noOfdigits);
        int finalNumber = 0;
        while(num>0){
            int lastDigit = num%10;
            finalNumber += pow(lastDigit,noOfdigits);
            num /= 10;
        }
        return finalNumber == numCopey;
    }
    public static int pow(int num1, int num2){

        int result = 1;
        int i=0;
        while(i<num2){
            result *= num1;
            i++;
        }
        //System.out.println("Pow of " + "is "+ result);
        return result;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num /=10;
        }
        return digits;
    }
}
