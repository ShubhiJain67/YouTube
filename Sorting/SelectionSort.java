
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,4,14,2,3};
        int len=arr.length;
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){o
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}