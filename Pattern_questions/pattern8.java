package Pattern_questions;
public class pattern8 {
    public static void main(String a[]){
        int number=1;
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
