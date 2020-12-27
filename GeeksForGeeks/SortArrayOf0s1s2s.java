class SortArrayof0s1s2s{
    public static void main(String args[]) {
        int arr[]={4, 3, 7, 8, 6, 2, 1};
        int size = arr.length;
        zig_zag(arr,size);
    }
    // Best TC which can be achieved : O(nlogn)
    public static void sort(int arr[],int size){
        // Use any Comparision Sort Method
    }
    // TC : O(n) SC : O(1) Unstable
    public static void frequency(int []arr) {
        int zero=0,one=0,two=0;
        // Get frequency for 0,1,2
        for(int num : arr){
            if(num == 0){
                zero++;
            }else if(num == 1){
                one++;
            }else{
                two++;
            }
        }
        //  Place 0's 1's and 2's
        int i=0;
        while(zero-- > 0){
            arr[i++]=0;
        }
        while(one-- > 0){
            arr[i++]=1;
        }
        while(two-- > 0){
            arr[i++]=2;
        }
    }
    // TC : O(n) SC : O(1) Unstable
    public static void 3_pointer(int arr[],int size) {
        int p1=0;
        int p2=size-1;
        int curr=0;
        while(curr<p2){
            if(arr[curr]==0){
                swap(arr,p1,curr);
                p1++;
                curr++;
            }else if(arr[curr]==1){
                curr++;
            }else{
                swap(arr,curr,p2);
                p2--;
            }
        }
    }
    // TC : O(n) SC : O(1) Stable
    public static void countingSort(int arr[],int size){
        
    }
}