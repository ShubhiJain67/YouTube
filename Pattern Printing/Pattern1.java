
class Pattern1{
    public static void main(String args[]) {
         /*
            **********
            **********
            **********
            **********
            **********
         */
        /*
            1111111
            2222222
            3333333
            4444444
         */

         int m=10;
         int n=8;

         for(int i=1;i<=m;i++){     //row count (m rows in the pattern)
            printStar(i,n);
            System.out.println();
         }

    }
    public static void printStar(int num,int n){
        for(int i=1;i<=n;i++)
        System.out.print(num);
    }

}