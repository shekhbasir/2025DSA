class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> st = new ArrayList<>();
        int kam = n / 3;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > kam && !st.contains(nums[i])) { 
                st.add(nums[i]);
            }
        }
        return st;
    }
}
