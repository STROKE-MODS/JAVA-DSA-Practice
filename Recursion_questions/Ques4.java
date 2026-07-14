package Recursion_questions;
import java.util.Scanner;
class backtracking{
    void backtrack(int n,int x){
        if(n<1){
            return;
        }
        backtrack(n-1,x);
        System.out.println(n);
    }
}
public class Ques4 {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int d;
        System.out.print("Enter the number : ");
        d = sc.nextInt();
        backtracking bt = new backtracking();
        bt.backtrack(d, d);
        sc.close();
    }
    
}
