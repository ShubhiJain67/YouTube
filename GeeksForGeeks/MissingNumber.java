import java.util.Arrays;

import sun.security.krb5.internal.LastReqEntry;

public class MissingNumber {
    public static void main(String[] args) {
        int len=8;
        int arr[]=new int[]{1,2,3,4,5,6,7};
    }
    public static int Approach1(int arr[],int len){
        int ans=0;
        boolean found=false;
        for(int i=1;i<=len;i++){
            for(int j : arr){
                if(i==j){
                    found=true;
                    break;
                }
            }
            if(found==false)
                return i;
        }
        return len;
    }
    public static int Approach2(int arr[],int len){
        Arrays.sort(arr);
        int num=1;
        for(int i : arr){
            if(num!=i)
                return num;
            num++;
        }
        return len;
    }
    public static int Approach3(int arr[],int len){
        int ans=0;
        boolean temp[]=new boolean[len];
        for(int i : arr){
            temp[i-1]=true;
        }
        for(int i=0;i<len;i++){
            if(temp[i]==false)
                return i+1;
        }
        return len; // not required
    }
    public static int Approach4(int arr[],int len){
        int ans=0;
        for(int i=1;i<=len;i++){
            ans+=i;
        }
        // or 
        // ans=(len)*(len+1)/2;
        for(int i : arr){
            ans-=i;
        }
        return ans;
    }
    public static int Approach5(int arr[],int len){
        int ans=0;
        for(int i=1;i<len;i++){
            ans+=i-arr[i-1];
        }
        ans+=len;
        return ans;
    }
    public static int Approach6(int arr[],int len){
        int xor=0;
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }
        for(int a:arr){
            if(a<=n){
                xor=xor^a;
            }
        }
        return xor;
    }
}
