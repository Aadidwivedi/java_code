import java.util.Scanner;

public class positivenegativezero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nCheck no is positive Negative or Zero:");

        int isnumber = input.nextInt();

        if(isnumber==0){
            System.out.println("This number is zero="+isnumber);
        } else if (isnumber>0) {
            System.out.println("This no is positive="+isnumber);

        }else{
            System.out.println("This no negative:"+isnumber);
        }
    }
}
