import java.util.Scanner;

public class threegretest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter three number A and B or C Find Greatest No");
        System.out.print("Please Enter the first no:");
        int A= input.nextInt();

        System.out.print("Please Enter the first no:");
        int B= input.nextInt();

        System.out.print("Please Enter the first no:");
        int C= input.nextInt();

        if(A>B && A>C){
            System.out.println("A is Grater:"+A);
        } else if (B>A && B>C) {
            System.out.println("B is Grater:"+ B);

        }else if(C>A && C>B){
            System.out.println("C is grater" +C);
        }else{
            System.out.println("ALL NO IS EQUAL:"+ A);
        }

    }
}
