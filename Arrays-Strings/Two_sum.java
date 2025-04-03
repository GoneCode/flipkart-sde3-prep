import java.util.Arrays;
import java.util.HashMap;

public class Two_sum{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};
        int target = 6;
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> num_count = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int y = target-nums[i];
            if(num_count.containsKey(y)){
                res[0]=i;
                res[1]=num_count.get(y);
                break;
            }
            num_count.put(nums[i],i);
        }
        return res;

    }
}