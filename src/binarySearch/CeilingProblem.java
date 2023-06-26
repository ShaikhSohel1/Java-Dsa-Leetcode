package binarySearch;

public class CeilingProblem {
    public static void main(String[] args) {
        char[] arr = new char[] {'c','f','j'};
        int start =0;
        int end = arr.length-1;
        char target='c';
//        System.out.println(arr[findCeiling(arr,start,end,target)]);
        System.out.println(nextGreatestLetter(arr,target));



    }

    static public int findCeiling(char[] arr,int start,int end, char target){




        while (start<=end) {

            int mid = start + (end - start)/2;

            if (target<arr[mid]) {
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid +1;
            }

            else {
                return 0;
            }
        }
        // returning start because when the loop ends the start will be pointing to the first greater of target automatically
        //because the while loop exit when start < end no longer true
        // so when start will get pass to the end then start will automatically point the smallest greater element of
        // target
        // for opposite i.e return greatest smallest number of target we can return end
        // because end will at the end going to point greatest smallest element number
        return start;

    }

    public  static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;

        while(start<=end){


            int mid = start+(end-start)/2;

            if(target < letters[mid]) {
                end = mid-1;

            }
            else {
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
