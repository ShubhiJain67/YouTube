public class Pattern6 {
    public static void main(String[] args) {
        /*
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
        */
        int n=9;
        for(int i=1;i<=n;i++){
            if(i<=(n+1)/2){
                print(i,'*');
            }else{
                print(n+1-i,'*');
            }
            System.out.println();
        }

        /*
                   * 
                  **
                 ***
                ****
               *****
                ****
                 ***
                  **
                   *
        */
        for(int i=1;i<=n;i++){
            if(i<=(n+1)/2){
                print((n+1)/2-i,' ');
                print(i,'*');
            }else{
                print(i-(n+1)/2,' ');
                print(n+1-i,'*');
            }
            System.out.println();
        }

    }
    public static void print(int n,char ch){
        for(int i=1;i<=n;i++){
            System.out.print(ch);
        }
    }
}