package Pattern_questions;
public class pattern5 {
    public static void main(String a[]){
        int n =5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
