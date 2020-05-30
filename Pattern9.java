public class Pattern9 {
    public static void main(String[] args) {
        /*
            ***********
             *********
              *******
               *****
                ***
                 *
                ***
               *****
              *******
             *********
            ***********
        */
        int n=17;
        int mid=(n+1)/2;
        for(int i=1;i<=n;i++){
            if(i<=mid){
                print(i-1,' ');
                print(mid+1-i,'*');
                print(mid-i,'*');
            }else{
                print(n-i,' ');
                print(i-(mid-1),'*');
                print(i-mid,'*');
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