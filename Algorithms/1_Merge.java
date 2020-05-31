
public class Merge {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,4,5,6,7};
        int ans[]=merge(arr1,arr2);
        for(int a:ans){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    private static int[] merge(int arr1[],int arr2[]){
        int ans[]=new int[arr1.length+arr2.length];
        int i=0,j=0,h=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[h++]=arr1[i++];
            }else{
                ans[h++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[h++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[h++]=arr2[j++];
        }
        return ans;
    }
}