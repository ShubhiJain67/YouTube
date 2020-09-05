import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
    }
    public static int Approach1(int arr[],int len){
        for(int p=0;p<len;p++){
            int leftsum=0;
            for(int i=0;i<p;i++)
                leftsum+=arr[i];
            int rightsum=0;
            for(int i=p+1;i<len;i++)
                rightsum+=arr[i];
            if(leftsum==rightsum)
                return p;
        }
        return -1;
    }
    public static int Approach2(int arr[],int len){
        int leftsum[]=new int[len+1];
        int rightsum[]=new int[len+1];
        int temp=0;
        for(int i=0;i<len;i++){
            leftsum[i]=temp;
            temp+=arr[i];
        }
        leftsum[len]=temp;
        temp=0;
        for(int i=len-1;i>=0;i--){
            rightsum[i]=temp;
            temp+=arr[i];
        }
        rightsum[0]=temp;
        for(int p=0;p<len;p++){
            if(leftsum[p]==rightsum[p+1])
                return p;
        }
        return -1;
    }
    public static int Approach3(int arr[],int len){
        int leftsum[]=new int[len+1];
        int sum=0;
        for(int i=0;i<len;i++){
            leftsum[i]=sum;
            sum+=arr[i];
        }
        leftsum[len]=sum; //here sum has the sum of all elements
        for(int p=0;p<len;p++){
            if(leftsum[p]==sum-leftsum[p]-arr[p])
                return p;
        }
        return -1;
    }
    public static int Approach4(int arr[],int len){
        int sum=0;
        for(int i : arr)
            sum+=i;
        int currsum=0;
        for(int p=0;p<len;p++){
            if(currsum==sum-currsum-arr[p])
                return p;
            currsum+=arr[p];
        }
        return -1;
    }
}