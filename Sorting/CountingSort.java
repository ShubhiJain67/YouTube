
public class CountingSort {
    public static void main(String[] args) {
        int minRange=-10;
        int maxRange=10;
        int len=maxRange-minRange+1;
        int arr[]={1,3,5,5,6,4,7,4,3,6,8,-2,-3};
        int count[]=new int[len];
        for(int i:arr){
            count[i-minRange]++;
        }
        int i=0;
        for(int c=0;c<len;c++){
            while(count[c]!=0){
                arr[i++]=c+minRange;
                count[c]--;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}