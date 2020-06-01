
public class SortArrayOf0s1s2s {
    public static void main(String[] args) {
        int arr[]={1,1,0,2,0,2,0,1,1,1,0,2};
        int count[]=new int[n];
        for(int a:arr){
            count[a]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]!=0){
                arr[index]=i;
                index++;
                count[i]--;
            }
        }
        for(int a :arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}