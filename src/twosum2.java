import java.util.Arrays;

public class twosum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int sum = arr[start] + arr[end];
            if(target == sum){
                return new int[]{start+1 , end+1};
            }
            if(sum<target) start++;
            else end--;
        }
        return new int[]{};
    }
}
