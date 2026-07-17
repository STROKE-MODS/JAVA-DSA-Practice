package Recursion_questions;
import java.util.Scanner;
class Factorial{
    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
public class Ques6{
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = scan.nextInt();
        Factorial fctor = new Factorial();
        int fd = fctor.factorial(num);
        System.out.println(fd);
        scan.close();
    }
}