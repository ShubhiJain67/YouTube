import java.util.*;
public class SpiralOrderOfMatrix{
    public static void main(String []args){
       int a[][] = { { 1, 2,17},
                   { 3, 4, 18},
                   { 5, 6,19},
                   { 7, 8, 20},
                   { 9, 10,21},
                   { 11, 12 ,22},
                   { 13, 14,23},
                   { 15, 16 ,24} };

       spiralOrderIterative(a);
       System.out.println();
       spiralOrderRecursive(a,0,a.length-1,0,a[0].length-1);
    }
    public static void spiralOrderIterative(int[][] matrix) {
       if (matrix.length == 0)
           return;
       int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1;
       while (r1 <= r2 && c1 <= c2) {
           for (int c = c1; c <= c2; c++)
               System.out.print(matrix[r1][c]+" ");
           for (int r = r1 + 1; r <= r2; r++)
               System.out.print(matrix[r][c2]+" ");
           if (r1 < r2 && c1 < c2) {
               for (int c = c2 - 1; c > c1; c--)
                   System.out.print(matrix[r2][c]+" ");
               for (int r = r2; r > r1; r--)
                   System.out.print(matrix[r][c1]+" ");
           }
           r1++;
           r2--;
           c1++;
           c2--;
       }
   }
   public static void spiralOrderRecursive(int[][] matrix,int r1,int r2,int c1,int c2) {
       if (matrix.length == 0)
           return;
       if(r1>r2 || c1>c2)
           return;
       for (int c = c1; c <= c2; c++)
           System.out.print(matrix[r1][c]+" ");
       for (int r = r1 + 1; r <= r2; r++)
           System.out.print(matrix[r][c2]+" ");
       if (r1 < r2 && c1 < c2) {
           for (int c = c2 - 1; c > c1; c--)
               System.out.print(matrix[r2][c]+" ");
           for (int r = r2; r > r1; r--)
               System.out.print(matrix[r][c1]+" ");
       }
       spiralOrderRec(matrix,r1+1,r2-1,c1+1,c2-1);
   }
}