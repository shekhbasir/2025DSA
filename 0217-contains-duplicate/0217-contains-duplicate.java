class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean kabhail=false;
        HashSet<Integer> kam=new HashSet<>();
        for(Integer val:nums){
            kam.add(val);
        }

        
        if(nums.length!=kam.size()){
            kabhail=true;
        }


        return kabhail;
    }
}