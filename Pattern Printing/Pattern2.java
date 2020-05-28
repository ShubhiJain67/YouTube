class Patten2{
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

        /**
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
         */
        int m=9;
         for(int i=1;i<=m;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(i+" ");
             }
             System.out.println();
         }
         
     
    }
}