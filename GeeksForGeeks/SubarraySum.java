
public class SubarraySum {
    public static void main(String[] args) {
        int [] arr={3,5,7,4,9,3,10,18,1};
        int taregt=100;
        int p1=0;
        int p2=0;
        int curSum=0;
        while(p1!=arr.length){
            while(p2!=arr.length){
                if(curSum+arr[p2]==taregt){
                    System.out.println(p1+" "+p2);
                    return;
                }else if(curSum+arr[p2]<taregt){
                    curSum+=arr[p2];
                    p2++;
                }else{
                    break;
                }
            }
            curSum-=arr[p1];
            p1++;
        }
        System.out.println("Subarray not found");
    }
}