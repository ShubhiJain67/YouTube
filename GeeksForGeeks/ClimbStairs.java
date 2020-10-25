public class ClimbStairs {
    public static void main(String[] args) {
        int target=10;
        memo=new int[target+1];
        for(int t=0;t<=target;t++)
            memo[t]=-1;
        System.out.println(climb(0,target));
        System.out.println(climbMemo(0,target));
        System.out.println(climbDP(target));
        System.out.println(climb2Pointer(target));
    }
    private static int steps[]={1,2};
    private static int climb(int curr,int target){
        if(curr==target)
            return 1;
        int count=0;
        if(curr+1<=target)
            count+=climb(curr+1,target);
        if(curr+2<=target)
            count+=climb(curr+2,target);
        return count;
    }
    private static int[] memo;
    private static int climbMemo(int curr,int target){
        if(memo[curr]!=0)
            return memo[curr];
        if(curr==target){
            memo[curr]=1;
            return 1;
        }
        memo[curr]=0;
        if(curr+1<=target)
            memo[curr]+=climbMemo(curr+1,target);
        if(curr+2<=target)
            memo[curr]+=climbMemo(curr+2,target);
        return memo[curr];
    }
    private static int climbDP(int target){
        int dp[]=new int[target+1];
        for(int curr=target;curr>=0;curr--){
            if(curr==target){
                dp[curr]=1;
                continue;
            }
            if(curr+1<=target)
                dp[curr]+=dp[curr+1];
            if(curr+2<=target)
                dp[curr]+=dp[curr+2];
        }
        return dp[0];
    }
    //only when steps are 1 and 2
    private static int climb2Pointer(int target){
        int a=1;
        int b=1;
        for(int curr=target-2;curr>=0;curr--){
            int temp=a+b;
            b=a;
            a=temp;
        }
        return a;
    }
}