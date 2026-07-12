package Pattern_questions;
public class pattern14{
    public static void main(String a[]){
        int spaces = 8;
        for(int i=0;i<5;i++){
                    for(int z=0;z<5-i;z++){
                        System.out.print("* ");
                    }
                    for(int r = 0;r<2*i;r++){
                        System.out.print("  ");
                    }
                    for(int z=5;z>i;z--){
                        System.out.print("* ");
                    }
                    System.out.println();
        }
        for(int i=0;i<5;i++){
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
                for(int r=0;r<spaces;r++){
                    System.out.print("  ");
                }
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }

                System.out.println();
                spaces-=2;
            }
        }
            
        }
    
