import java.util.Scanner;
class working{
    void repetition(int x,int n){
        if(x>n){
            return;
        }
        System.out.println(x);
        repetition(++x,n);
    }
}
public class Ques2 {
    public static void main(String a[]){
        int d;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the linear fashion number you need: ")    ;
        d = in.nextInt();
        working f1 = new working();
        f1.repetition(1,d);
        in.close();
    }
}
