
class Solution {

    public int maximumSum(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int ans = -1;

        for(int num : nums){

            int sum = digitSum(num);

            if(map.containsKey(sum)){

                ans = Math.max(
                        ans,
                        num + map.get(sum)
                );

                map.put(
                    sum,
                    Math.max(map.get(sum), num)
                );
            }
            else{
                map.put(sum,num);
            }
        }

        return ans;
    }

    private int digitSum(int num){

        int sum = 0;

        while(num > 0){

            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}