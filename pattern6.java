public class pattern6 {
    public static void main(String a[]){
        int start = 1;
        int n=5;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start = 0;
            for(int k=0;k<=i;k++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
