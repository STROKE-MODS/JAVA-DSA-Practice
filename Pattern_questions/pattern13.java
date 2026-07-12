package Pattern_questions;
public class pattern13 {
    public static void main(String b[]){
        for(int i=0;i<4;i++){
            for(char c = (char)('E'-i);c<='E';c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
