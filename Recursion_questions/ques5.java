package Recursion_questions;
import java.util.Scanner;
class hello{
    void repeti(int x,int d){
        if(x>d){
            return;
        }
        repeti(x+1, d);
        System.out.println(x);
    }
}
public class ques5 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int d;
        System.out.print("Enter the number : ");
        d= scan.nextInt();
        hello hi = new hello();
        hi.repeti(1,d);
        scan.close();
    }
}
