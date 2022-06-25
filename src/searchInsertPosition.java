public class searchInsertPosition {
    public static void main(String[] args) {
        int[] nums = { 1,3,5,6 };
        int target = 2;
        System.out.println( searchInsert1(nums , target));
    }

    static public int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) start = mid +1;
            else end = mid - 1;
        }
        return start;
    }
}
