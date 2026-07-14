package Recursion_questions;
import java.util.Scanner;
class recursive{
    void From0ToN(int x,int d){
        if(x<1){
            return;
        }
        System.out.println(x);
        From0ToN(--x, d);

    }
}
public class Ques3 {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int d;
        System.out.print("Enter the number : ");
        d = sc.nextInt();
        recursive tn = new recursive();
        tn.From0ToN(d, d);
        sc.close();
    }
}
