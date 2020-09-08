public class MaximumSumSubarray{
    public static void main(String[] args) {
        int arr[]={1,2,-1,-2,-3,4,5,6};
        int len=arr.length;
        System.out.println("Maximum sum is : "+DivideAndConquerApproach(arr, 0, len-1));
    }
    public static int NaiveApproach(int arr[],int len){
        int max=0;
        for(int s=0;s<len;s++){
            int curr=0;
            for(int e=s;e<len;e++){
                curr+=arr[e];
                max=Math.max(max,curr);
            }
        }
        return max;
    }
    public static int DivideAndConquerApproach(int arr[],int start,int end){
        if(start==end){
            return Math.max(0,arr[start]);
        }
        int mid=start+(end-start)/2;
        int leftMax=Approach2DNC(arr, start, mid-1);
        int rightMax=Approach2DNC(arr, mid+1, end);
        int midMax=getMaxIncMid(arr,start,mid,end);
        return Math.max(leftMax,Math.max(rightMax,midMax));
    }
    public static int getMaxIncMid(int arr[],int s,int m,int e){
        int leftMax=0,rightMax=0,curr=0;
        for(int i=m;i>=s;i--){
            curr+=arr[i];
            leftMax=Math.max(leftMax,curr);
        }
        curr=0;
        for(int i=m;i<=e;i++){
            curr+=arr[i];
            rightMax=Math.max(rightMax,curr);
        }
        return Math.max(leftMax,Math.max(rightMax,leftMax+rightMax-arr[m]));
    }
    public static int Kadane(int arr[],int len){
        int max=0,curr=0;
        for(int i=0;i<len;i++){
            curr+=arr[i];
            if(curr<0)
                curr=0;
            else if(max<curr)
                max=curr;
        }
        return max;
    }
}