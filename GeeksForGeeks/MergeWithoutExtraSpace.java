public class MergeWithoutExtraSpace {

    public static void main(String args[]) {
        System.out.println("Lets Start");
        int arr1[] = { 1, 3, 5, 7}, arr2[] = { 2, 4, 6, 8, 9 };
        Approach2(arr1, arr2);
        Print(arr1, arr2);
    }

    public static void Approach1(int arr1[], int arr2[]) {
        int len1 = arr1.length, len2 = arr2.length, pointer2 = 0;
        for (int pointer1 = 0; pointer1 < len1; pointer1++) {
        if (arr1[pointer1] > arr2[pointer2]) {
            int temp = arr1[pointer1];
            arr1[pointer1] = arr2[pointer2];
            int p = pointer2 + 1;
            while (p < len2 && arr2[p] < temp) {
            arr2[p - 1] = arr2[p];
            p++;
            }
            arr2[p - 1] = temp;
        }
        pointer1++;
        }
    }

    public static void Approach2(int arr1[], int arr2[]) {
        int n = arr1.length, m = arr2.length;
        int gap = n + m;
        gap = (gap / 2) + (gap % 2);
        int pointer1 = 0;
        int pointer2 = 0;
        while (gap > 0) {
        // Setting pointers
        pointer1 = 0;
        pointer2 = gap < n ? gap : gap - n;
        //Both the pointers are in the firt arrays
        if (gap < n) {
            while (pointer1 < n && pointer2 < n) {
                check(arr1, arr1, pointer1, pointer2);
                pointer1++;
                pointer2++;
            }
        }

        //Setting pointer2 at the start of second array
        if(pointer2 == n){
            pointer2 = 0;
        }

        //While pointer1 is in first array and pointer 2 is in second array
        while (pointer1 < n && pointer2 < m) {
            check(arr1, arr2, pointer1, pointer2);
            pointer1++;
            pointer2++;
        }

        //Setting pointer1 at the start of second array
        if(pointer1 == n){
            pointer1 = 0;
        }

        //While pointer1 and pointer 2 are in second array
        while (pointer1 < m && pointer2 < m) {
            check(arr2, arr2, pointer1, pointer2);
            pointer1++;
            pointer2++;
        }
        if(gap == 1){
            break;
        }
        gap = (gap / 2) + (gap % 2);
        }
    }

    public static void check(int arr1[], int arr2[], int pointer1, int pointer2) {
        if (arr1[pointer1] > arr2[pointer2]) {
            int temp = arr1[pointer1];
            arr1[pointer1] = arr2[pointer2];
            arr2[pointer2] = temp;
        }
    }
}
