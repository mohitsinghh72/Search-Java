//Binary search

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 51;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {      //If middle element is the target element.
                return mid;
            }
            else if(arr[mid]<target ) {             //If middle element is shorter than the target element
                start = mid + 1;
            }
            else {
                end = mid - 1;                      //If middle element is larger than the target element
            }
        }
        return -1;
    }
}