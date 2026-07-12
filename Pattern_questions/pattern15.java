package Pattern_questions;
public class pattern15 {
    public static void main (String a[]){
        int inis=8;
        //stars
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            
            //space
            
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

        
        //stars
        
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        inis-=2;
    }
    int endis=2;
    for(int i=0;i<4;i++){
        //stars
        for(int j=4;j>i;j--){
            System.out.print("*");
        }
        //space
        for(int k=0;k<endis;k++){
            System.out.print(" ");
        }
        //stars
        for(int j=4;j>i;j--){
            System.out.print("*");
        }
        System.out.println();
        endis+=2;
    }

    //Method 2
    int n=10;
    int spaces = 8;
    for(int i=0;i<n;i++){
        if(i<(n/2)){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces-=2;
        }
        else{
            spaces+=2;
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    }



}
