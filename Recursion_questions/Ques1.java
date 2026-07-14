import java.util.Scanner;
class repetition{
    void repetition_me(int x,int n){
        if(x>n){
            return;
        }
        System.out.println("Himanshu");
        repetition_me(x+1, n);
    }
}
public class Ques1{
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int d;
        System.out.print("How many times you want to print your name : ");
        d = scan.nextInt();
        repetition num = new repetition();
        num.repetition_me(1, d);
        scan.close();  
    }
}