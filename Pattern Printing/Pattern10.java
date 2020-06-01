
public class Pattern10 {
    public static void main(String[] args) {

        /*
            1
            12
            123
            1234
            12345
            123456
        */
        int n=10;
        for(int i=1;i<=n;i++){
            print(1,i);
            System.out.println();
        }
        /*
                 1
                12
               123
              1234
             12345
            123456
        */
        for(int i=1;i<=n;i++){
            space(n-i);
            print(1,i);
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