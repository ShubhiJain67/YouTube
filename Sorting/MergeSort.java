class MergeSort{
    public static void main(String[] args) {
        int arr[]={5,4,6,3,7,2,9,4,5,6,7,3,2,1};
        MergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private static void MergeSort(int arr[],int i,int j){
        if(i==j)
            return;
        int mid=(i+j)/2;
        MergeSort(arr, i, mid);
        MergeSort(arr,mid+1, j);
        merge(arr,i,mid,mid+1,j);
    }
    private static void merge(int arr[],int i1,int j1,int i2,int j2){
        int arr1[] =new int[j1-i1+1];
        int arr2[]=new int[j2-i2+1];
        int ii=0;
        for(int i=i1;i<=j1;i++){
            arr1[ii++]=arr[i];
        }
        ii=0;
        for(int i=i2;i<=j2;i++){
            arr2[ii++]=arr[i];
        }
        int i=0,j=0,h=i1;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[h++]=arr1[i++];
            }else{
                arr[h++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            arr[h++]=arr1[i++];
        }
        while(j<arr2.length){
            arr[h++]=arr2[j++];
        }
    }
}