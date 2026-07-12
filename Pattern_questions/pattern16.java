package Pattern_questions;
public class pattern16 {
    public static void main(String a[]){
        int n=4;
        for(int i=0;i<n;i++){
            if(i==0||i==(n-1)){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int k=0;k<n-2;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                        }
        }
        //Method 2
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==0 || j== n-1 || i== n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
