package InterviewPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =scn.nextInt();

        StringBuffer sbg = new StringBuffer(String.valueOf(num));

        StringBuffer rev = sbg.reverse();
        System.out.println(rev);




    }
}
