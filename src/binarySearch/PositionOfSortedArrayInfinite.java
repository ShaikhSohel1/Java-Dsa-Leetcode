package binarySearch;

public class PositionOfSortedArrayInfinite {
    public static void main(String[] args) {
    int target = 15;
    int[] arr = {1,3,5,7,6,15,20,22,56,60};
    int[] ans=FindPosition(target,arr);
    int start=ans[0];
    int end = ans[1];
        System.out.println(BinarySearch(arr,target,start,end));

    }

   public static int[]  FindPosition(int target, int[] arr){
        int start=0;
        int end=1;
        while (target>=arr[end]) {
                start=end;
                end=end*2;
        }
       int[] ans= {start,end};
        return ans;
   }

    public static int BinarySearch(int[] arr, int target,int start,int end){
    while (start<=end){
        int mid=(start+end)/2;

        if (target>arr[mid]){
            start=mid+1;
        }

        else if(target < arr[mid]){
            end=mid-1;
        }
        else
            return mid;
    }
    return -1;
    }

}

