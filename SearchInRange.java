// Search In Range by Liner Search

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,77,52,34,35,5,23,243,32};
        int startIndex = 3;
        int endIndex = 8;
        int target = 33;

        boolean ans = SearchRange(arr,startIndex,endIndex,target);
        System.out.println(ans);

    }

    // Here start is the index of the array where user wants to start the search and end is the point user wants to search till this index
    static boolean SearchRange(int[] arr, int start,int end,int target){
        if(end > arr.length-1){                 // if user insert index more than the size of the array, then it returns false.
            return false;
        }
        if(start < 0){                  //if user insert less than 0 it also returns false as we know that array index starts from 0.
            return false;
        }

        for(int i = start;i<=end;i++){
            if(target == arr[i]){
                return true;                    // if target element found within the range then returns true.
            }
        }
        return false;                       // if target element does not found then it returns false.
    }
}
