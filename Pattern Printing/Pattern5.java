public class Pattern5 {
    public static void main(String[] args) {
        /*
            ********
            *******
            ******
            *****
            ****
            ***
            **
            *
        */
        int n=8;
        for(int i=1;i<=n;i++){
            print(n-i+1,'*');
            System.out.println();
        }
        /*
            ********
             *******
              ******
               *****
                ****
                 ***
                  **
                   *
        */
        for(int i=1;i<=n;i++){
            print(i-1,' ');
            print(n-i+1,'*');
            System.out.println();
        }

    }
    public static void print(int n,char ch){
        for(int i=1;i<=n;i++){
            System.out.print(ch);
        }
    }
}

