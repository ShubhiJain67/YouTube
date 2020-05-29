public class Pattern7 {
    public static void main(String[] args) {
        /*
               *
              ***
             *****
            *******
             *****
              ***
               *
        */
        int n=9;
        for(int i=1;i<=n;i++){
            if(i<=(n+1)/2){
                print((n+1)/2-i,' ');
                print(2*i-1,'*');
                System.out.println();
            }
            else{
                print(i-(n+1)/2,' ');
                print(2*n-2*i+1,'*');
                System.out.println();
            }
        }
    }
    public static void print(int n,char ch){
        for(int i=1;i<=n;i++){
            System.out.print(ch);
        }
    }
}