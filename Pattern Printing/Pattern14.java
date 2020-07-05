public class Pattern14 {
    public static void main(String[] args) {
        int n=21,m=n/2;
        for(int i=1;i<=n;i++){
            if(i<=m){
                printD(3*(m-i+1));
                printT(i-1);
                printD(3*(m-i+1));
            }
            else if(i==m+1){
                printD(3*m-2);
                System.out.print("WELCOME");
                printD(3*m-2);
            }
            else{
                printD(3*(m-(n+1-i)+1));
                printT((n+1-i)-1);
                printD(3*(m-(n+1-i)+1));
            }
            System.out.println();
        }
    }
    private static void printD(int n){
        for(int i=1;i<=n;i++)
            System.out.print("-");
    }
    private static void printT(int n){
        System.out.print(".");
        for(int i=1;i<=n;i++)
            System.out.print("|..");
        System.out.print("|");
        for(int i=1;i<=n;i++)
            System.out.print("..|");
        System.out.print(".");
    }
}