class ConvertArrayIntoZigZagFashion{
    public static void main(String args[]) {
        int arr[]={4, 3, 7, 8, 6, 2, 1};
        int size = arr.length;
        zig_zag(arr,size);
    }
    public static void zig_zag(int arr[],int size){
        int peakUp = true;
        for(int i=0;i<size-1;i++){
            // If the peak is in upward direction
            if(peakUp){
                if(arr[i]>arr[i+1]){
                    // Swap the 2
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else{
                    //Already in correct posistion
                }
            }
            // If the peak is in downward direction
            else{
                if(arr[i]<arr[i+1]){
                    // Swap the 2
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else{
                    //Already in correct posistion
                }
            }
            // Toggle the peak direction
            peakUp = !peakUp;
        }
        // Display the result
        printArray(arr);
    }
    public static void printArray(int []arr) {
        for(int num : arr){
            System.out.println(num+" ");
        }
    }
}