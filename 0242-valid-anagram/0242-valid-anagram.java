class Solution {
    public boolean isAnagram(String s, String t) {
        //now i am going tofinding the code if the is the anagram or not 
        boolean kam=false;

        if(s.length()!=s.length()) return false;

        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sam1=new String(arr1);
        String sam2=new String(arr2);

        if(sam1.equals(sam2)){
            kam=true;
        }
         return kam;
    }
}