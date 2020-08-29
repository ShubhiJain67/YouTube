public class MergeWithoutExtraSpace{
    public static void main(string args[]){
        int arr1[]={1,3,5,7,9},arr2[]={2,4,6,8,10};
        Approach1(arr1,arr2);
        for(int i : arr1)
            System.out.print(i+" ");
        for(int i : arr2)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void Approach1(int arr1[],int arr2[]){
        int len1=arr1.length,len2=arr2.length,pointer2=0;
        for(int pointer1=0;pointer1<len1;pointer1++){
            if(arr1[pointer1]>arr2[pointer2]){
                int temp=arr1[pointer1];
                arr1[pointer1]=arr2[pointer2];
                int p=pointer2+1;
                while(p<len2 && arr2[p]<temp){
                    arr2[p-1]=arr2[p]
                    p++;
                }
                arr2[p-1]=temp;
            }
            pointer1++;
        }
    }
    public static void Approach2(int arr1[],int arr2[]){
        int len1=arr1.length,len2=arr2.length,pointer1=0,pointer2=0;
        int gap=len1+len2;
        gap=(gap/2)+(gap%2);
        while(gap>1){
            pointer1=0;
            pointer2=gap-1;
            //When both pointers are in 1st array
            while(pointer2<len1){
                check(arr1,arr1,pointer1,pointer2);
                pointer1++;
                pointer2++;
            }
            //When 1st pointer in first array and 2nd in 2nd array
            pointer2=0;
            while(pointer1<len1 && pointer2<len2){
                check(arr1,arr2,pointer1,pointer2);
                pointer1++;
                pointer2++;
            }
            //When both pointers are in 1st array
            pointer1=0;
            while(pointer2<len2){
                check(arr2,arr2,pointer1,pointer2);
                pointer1++;
                pointer2++;
            }
            gap=(gap/2)+(gap%2);
        }
    }
    public static void check(int arr1[],int arr2[],int pointer1,int pointer2){
        if(arr1[pointer1]>arr2[pointer2]){
            int temp=arr1[pointer1];
            arr1[pointer1]=arr2[pointer2];
            arr2[pointer2]=temp;
        }
    }
}
