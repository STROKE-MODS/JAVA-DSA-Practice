package Pattern_questions;
public class pattern12{
    public static void main(String a[]){
        int n=8;
        for(int i=1;i<n;i++){
            for(int k=0;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(char hi='A';hi<'A'+i;hi++){
                System.out.print(hi);
            }
            char r=(char)('A'+i-2);
            for(int h=1;h<i;h++){
                System.out.print(r);
                r--;
            }
            System.out.println();
        }
    }
}