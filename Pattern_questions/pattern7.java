package Pattern_questions;
public class pattern7 {
    public static void main(String a[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
