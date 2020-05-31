
public class MissingNumber {
    public static void main(String[] args) {
        int n=8;
        int arr[]={9,1,8,5,4,3,7,6};
        int xor=0;
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }
        for(int a:arr){
            if(a<=n){
                xor=xor^a;
            }
        }
        System.out.println(xor);
    }
}