import java.util.Scanner;
class reverse{
    void f(int i,int []a,int d){
        if(i>=d/2){
            return ;
        }
        int temp;
        temp = a[i];
        a[i] = a[d-i-1];
        a[d-i-1] = temp;
        f(i+1,a,d);
    }
}
public class Another_quetion{
    public static void main(String a[])
    {
    Scanner scan = new Scanner(System.in);
    int b[] = new int[8];
    for(int i=0;i<b.length;i++){
        System.out.print("Enter the number : ");
        b[i]=scan.nextInt();
     }
     System.out.print("The array is : ");
     for(int i=0;i<b.length;i++){
        System.out.print(b[i]+ " ");
     }
    reverse rev = new reverse();
    rev.f(0,b,b.length);
    System.out.print('\n'+"The reversed array is : ");
    for(int i=0;i<b.length;i++){
        System.out.print(b[i]+ " ");
    }
    scan.close();
    }
}
