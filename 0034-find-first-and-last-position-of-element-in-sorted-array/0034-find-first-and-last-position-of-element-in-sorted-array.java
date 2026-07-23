class Solution {
    public int[] searchRange(int[] nums, int target) {
        int kam1 = -1;
        int kam2 = -1;
        int st = 0;
        int last = nums.length - 1;

        
        while (st <= last) {
            
            if (nums[st] == target && kam1 == -1) {
                kam1 = st;
            }
            
            if (nums[last] == target && kam2 == -1) {
                kam2 = last;
            }

           
            if (kam1 != -1 && kam2 != -1) {
                break;
            }

            if (kam1 == -1) {
                st++;
            }
            
            if (kam2 == -1) {
                last--;
            }
        }

        return new int[]{kam1, kam2};
    }
}
