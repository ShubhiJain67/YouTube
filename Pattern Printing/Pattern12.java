public class Pattern12 {
    public static void main(String[] args) {
        /*
            1
            121
            12321
            1234321
            123454321
            12345654321
            1234567654321
        */
        int n=7;
        for(int i=1;i<=n;i++){
            print(1,i);
            print(i-1,1);
            System.out.println();
        }
        /*
                        1
                      121
                    12321
                  1234321
                123454321
              12345654321
            1234567654321
        */
        for(int i=1;i<=n;i++){
            space(2*n-1-(2*i-1));
            print(1,i);
            print(i-1,1);
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

