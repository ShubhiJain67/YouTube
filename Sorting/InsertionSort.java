
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,3,45,6,76,54,3,3,4,0,567,8};
        int len=arr.length;
        for(int i=1;i<len;i++){
            int help=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>help){
                    arr[j+1]=arr[j];
                }else{
                    arr[j+1]=help;
                    break;
                }
            }
            if(j==-1){
                arr[0]=help;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}