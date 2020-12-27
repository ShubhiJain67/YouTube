public class LastIndexof1 {
    public static void main(String[] args) {
        int [] arr={3,5,7,4,9,3,10,18,1};
        int size=arr.length;
        FindLast(arr,size);
    }
    // TC : O(n) SC : O(1)
    private static void FindLast(int arr[],int size){
        int index=-1;
        for(int i=size-1;i>=0;i--){
            if(arr[i] == 1){
                index=i;
                break;
            }
        }
       System.out.println(index);
    }
}
