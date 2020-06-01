public class Pattern13 {
    public static void main(String[] args) {
        /*
                       1
                     1 2 1
                   1 2 3 2 1
                 1 2 3 4 3 2 1
               1 2 3 4 5 4 3 2 1
             1 2 3 4 5 6 5 4 3 2 1
           1 2 3 4 5 6 7 6 5 4 3 2 1
             1 2 3 4 5 6 5 4 3 2 1 
               1 2 3 4 5 4 3 2 1
                 1 2 3 4 3 2 1
                   1 2 3 2 1
                     1 2 1
                       1
        */
        int n=13;
        for(int i=1;i<=n;i++){
            int mid=(n+1)/2;
            if(i<=mid){
                space(mid-i);
                print(1,i);
                print(i-1,1);
            }else{
                space(i-mid);
                print(1,n+1-i);
                print(n-i,1);
            }
            System.out.println();
        }
    }
    public static void space(int n){
        for(int i=1;i<=n;i++){
            System.out.print("  ");
        }
    }
    public static void print(int start,int end){
        if(start<=0 || end<=0)
            return;
        if(start>end){
            for(int i=start;i>=end;i--){
                System.out.print(i+" ");
            }
            return;
        }
        for(int i=start;i<=end;i++){
            System.out.print(i+" ");
        }
    }
}

