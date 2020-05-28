
public class Pattern4 {
    public static void main(String[] args) {

        /*
                  *
                 ***
                *****
               *******
              *********
             ***********
            *************
        */
        int n=10;
        for(int i=1;i<=n;i++){
            print(n-i,' ');
            print(2*i-1,'*');
            System.out.println();
        }
    }
    public static void print(int n,char ch){
        for(int i=1;i<=n;i++)
            System.out.print(ch);
    }
}