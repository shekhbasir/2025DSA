class Solution {
    public int[] searchRange(int[] nums, int target) {
        int kam1 = -1;
        int kam2 = -1;
        int st = 0;
        int last = nums.length - 1;

        // Aapke style mein ek single loop jo dono ends se check karega
        while (st <= last) {
            // Agar pehla index nahi mila aur start pointer par target hai
            if (nums[st] == target && kam1 == -1) {
                kam1 = st;
            }
            // Agar aakhri index nahi mila aur last pointer par target hai
            if (nums[last] == target && kam2 == -1) {
                kam2 = last;
            }

            // Agar dono mil gaye toh aage loop chalane ki zaroorat nahi, yahin ruk jao
            if (kam1 != -1 && kam2 != -1) {
                break;
            }

            // Agar st par target nahi mila, toh aage badho
            if (kam1 == -1) {
                st++;
            }
            // Agar last par target nahi mila, toh peeche aao
            if (kam2 == -1) {
                last--;
            }
        }

        return new int[]{kam1, kam2};
    }
}
