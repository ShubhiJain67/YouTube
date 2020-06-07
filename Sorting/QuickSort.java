
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={1,2,34,532,3,45,6,322,345,67,6};
        QuickSort(arr, 0, arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    private static void QuickSort(int arr[],int s,int e){
        if(s>=e)
            return;
        int index=partition(arr, s, e);
        QuickSort(arr, s, index-1);
        QuickSort(arr, index+1, e);
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