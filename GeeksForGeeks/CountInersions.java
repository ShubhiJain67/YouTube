
public class CountInersions {
    public static void main(String[] args) {
        int arr[]={70,65,85,3,2};
        int ans=Approach1(arr,0,arr.length-1);
        System.out.println("No of Inersions : "+ans );
    }
    private static int Approach1(int [] arr,int len){
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }
        }   
        return count;
    }
    private static int Approach2(int [] arr,int i,int j){
        if(i==j)
            return 0;
        int mid=(i+j)/2;
        int left=Count(arr,i,mid);
        int right=Count(arr,mid+1,j);
        int merge=Merge(arr,i,mid,j);
        return left+right+merge;
    }
    private static int Merge(int arr[],int i,int m,int j){
        int [] help=new int[j-i+1];
        int h=0,a=i,b=m+1;
        int ans=0;
        while(a<=m && b<=j){
            if(arr[a]>arr[b]){
                ans+=m-a+1;
                help[h++]=arr[b++];
            }else{
                help[h++]=arr[a++];
            }
        }
        while(a<=m){
            help[h++]=arr[a++];
        }
        while(b<=j){
            help[h++]=arr[b++];
        }
        h=0;
        while(i<=j){
            arr[i++]=help[h++];
        }
        return ans;
        
    }
}
