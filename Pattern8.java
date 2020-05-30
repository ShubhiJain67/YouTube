public class Pattern8 {
    public static void main(String[] args) {
        /*
            ***********
            ***** *****
            ****   ****
            ***     ***
            **       **
            *         *
            **       **
            ***     ***
            ****   ****
            ***** *****
            ***********
        */
        int n=13;
        int mid=(n+1)/2;
        print(n,'*');
        System.out.println();
        for(int i=2;i<n;i++){
            if(i<=mid){
                print(mid-i+1,'*');
                print(i-1,' ');
                print(i-2,' ');
                print(mid-i+1,'*');
            }else{
                print(i-mid+1,'*');
                print(n-i,' ');
                print(n-i-1,' ');
                print(i-mid+1,'*');
            }
            System.out.println();
        }
        print(n,'*');
        System.out.println();
    }
    public static void print(int n,char ch){
        for(int i=1;i<=n;i++){
            System.out.print(ch);
        }
    }
}