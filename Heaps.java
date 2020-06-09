
public class HeapImplementation {
    public static class Heap{
        int heap[];
        int currSize;
        Heap(int len){
            this.heap=new int[len];
            this.currSize=-1;
        }
        
        void add(int num){
            this.currSize++;
            this.heap[this.currSize]=num;
            HeapifyUp();
        }
        
        void swap(int index1,int index2){
            int temp=this.heap[index1];
            this.heap[index1]=this.heap[index2];
            this.heap[index2]=temp;
        }
        
        void HeapifyUp(){
            int child=this.currSize;
            int parent=(child-1)/2;
            while(child!=0){
                if(this.heap[child]<this.heap[parent]){
                    swap(child,parent);
                    child=parent;
                    parent=(child-1)/2;

                }else{
                    break;
                }
            }
        }
        
        int delete(){
            int ans=this.heap[0];
            this.heap[0]=this.heap[this.currSize];
            this.heap[this.currSize]=0;
            this.currSize--;
            HeapifyDown();
            return ans;
        }
        
        void HeapifyDown(){
            int parent=0;
            int child1=1;
            int child2=2;
            while(parent<this.currSize){
                if(child1<this.currSize && child2<this.currSize){
                    if(this.heap[child1]<this.heap[child2]){
                        if(this.heap[parent]>this.heap[child1]){
                            swap(parent,child1);
                            parent=child1;
                            child1=parent*2+1;
                            child2=parent*2+2;
                        }
                        else{
                            return;
                        }
                        
                    }else{
                        if(this.heap[parent]>this.heap[child2]){
                            swap(parent,child2);
                            parent=child2;
                            child1=parent*2+1;
                            child2=parent*2+2;
                        }
                        else{
                            return;
                        }
                    }
                }
                else if(child1<this.currSize){
                    if(this.heap[parent]>this.heap[child1]){
                        swap(parent,child1);
                        parent=child1;
                        child1=parent*2+1;
                        child2=parent*2+2;
                    }
                    else{
                        return;
                    }
                }
                else{
                    return;
                    
                }
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={1,23,2,34,5,543,3,456,6,543,567,2345};
        Heap h=new Heap(arr.length);
        for(int a:arr){
            h.add(a);
        }
        for(int a:h.heap){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(h.delete());
        for(int a:h.heap){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}