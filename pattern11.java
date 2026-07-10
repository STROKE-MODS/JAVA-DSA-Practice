public class pattern11 {
    public static void main(String a[]){
        char alpha = 'A';
        for(int i=0;i<5;i++){
            for(int k=0;k<=i;k++){
                System.out.print(alpha);
            }
            alpha++;
            System.out.println();
        }
    }
}
