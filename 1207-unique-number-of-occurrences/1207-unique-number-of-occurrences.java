class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> st=new HashMap<>();

        for(Integer val:arr){
            st.put(val,st.getOrDefault(val,0)+1);
        }

        HashSet<Integer> st1=new HashSet<>();
        for(Integer val1:st.values()){
            if(st1.contains(val1)){
                return false;
            }
            st1.add(val1);
        }


        return true;
    }
}