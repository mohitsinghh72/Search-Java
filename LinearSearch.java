public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans = search(arr,25);
        System.out.println(ans);
    }

    // function for search in the linear array

    static int search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("found");
                return i;                           // returns the index of target element if found.
            }
        }                                           // I use -1 because index cannot be -1
        return -1;                                  // return -1 is target element is not found
    }
}

// ----------------------------------------------------------------------------------------------------------------- //

// finding in String

public class LinearSearch{
    public static void main(String[] args){
        String name = "Ramcharan";
        boolean ans = search(name,'z');
        System.out.println(ans);

    }
    static boolean search(String str, char target){
        if(str.length() == 0){                      // if length of string is 0. then it returns false.
            return false;
        }

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == target){   //charAt(i) only consider the element that is at index i
                return true;
            }
        }
        return false;
    }
}

