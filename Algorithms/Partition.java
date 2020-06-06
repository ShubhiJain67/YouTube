public class Partition{
    public static void main(String[] args) {
       int arr[]={1,4,4,56,3,543,4,23,45,67,652,345,76};
       System.out.println("The pivot index is : "+partition(arr,0,arr.length-1));
       for(int a:arr){
           System.out.print(a+" ");
       }
       System.out.println();
    }
    private static int partition(int arr[],int s,int e){
        int pivot=arr[e];
        int i=s;
        for(int j=s;j<e;j++){
            if(arr[j]<pivot){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[e];
        arr[e]=temp;
        return i;
    }
}