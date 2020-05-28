
public class Pattern3 {
    public static void main(String[] args) {

        /*
                  *
                 **
                ***
               ****
              *****
             ******
            *******
        */
        int n=10;
        for(int i=1;i<=n;i++){
            print(n-i,' ');
            print(i,'*');
            System.out.println();
        }
    }
    public static void print(int n,char ch){
        for(int i=1;i<=n;i++)
            System.out.print(ch);
    }
}