import java.util.ArrayList;

class Solution {  
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        ArrayList<Character> st = new ArrayList<>();

        // Add all chars of s into list
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }

        // Check chars of t one by one
        for (int j = 0; j < t.length(); j++) {
            char ch1 = t.charAt(j);
            if (st.contains(ch1)) {
                st.remove(Character.valueOf(ch1)); // ✅ remove by value
            } else {
                return false; // agar char nahi mila → not anagram
            }
        }

        return st.isEmpty(); // sab delete ho gaye to true
    }
}
