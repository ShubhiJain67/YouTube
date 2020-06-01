public class Pattern11 {
    public static void main(String[] args) {
        /*
            1234567
            123456
            12345
            1234
            123
            12
            1
        */
        int n=8;
        for(int i=1;i<=n;i++){
            print(1,n-i+1);
            System.out.println();
        }
        /*
            1234567
             123456
              12345
               1234
                123
                 12
                  1
        */
        for(int i=1;i<=n;i++){
            space(i-1);
            print(1,n-i+1);
            System.out.println();
        }

    }
    public static void space(int n){
        for(int i=1;i<=n;i++){
            System.out.print("  ");
        }
    }
    public static void print(int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(i+" ");
        }
    }
}

