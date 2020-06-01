import java.util.*;
public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[]={20,20,19,18,16,5,3,2,7,4,8};
        int max=arr[arr.length-1];
        ArrayList<Integer> leader=new ArrayList<>();
        leader.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                leader.add(arr[i]);
                max=arr[i];
            }
        }
        for(Integer a: leader){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}