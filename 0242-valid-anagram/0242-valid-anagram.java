import java.util.ArrayList;

class Solution {  
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        ArrayList<Character> st = new ArrayList<>();

       
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }

       
        for (int j = 0; j < t.length(); j++) {
            char ch1 = t.charAt(j);
            if (st.contains(ch1)) {
                st.remove(Character.valueOf(ch1)); 
            } else {
                return false;
            }
        }

        return st.isEmpty(); 
    }
}
