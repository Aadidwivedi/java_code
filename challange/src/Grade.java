import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the mark Grade:");
        System.out.println("Enter THe Grade:");
        int Grade = input.nextInt();

        if(Grade>90){
            System.out.println("Pass! You Are Grade 'A' ");
        } else if (Grade>75 && Grade<90) {
            System.out.println("Pass! You Are Grade 'B' ");
        }else if(Grade>60 && Grade<75){
            System.out.println("Pass! You Are Grade 'C' ");
        }else if(Grade>30 && Grade<60){
            System.out.println("Pass! You Are Grade 'D' ");
        }else{
            System.out.println("Fail! You Are Grade 'F' ");
        }
    }
}
