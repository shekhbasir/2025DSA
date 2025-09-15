class Solution {
    public String removeOuterParentheses(String s) {
        int strlen=s.length();
        int count=0;
        String str="";
        for(int i=0;i<strlen;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count!=0){
                    str+=ch;
                }
                count++;
            }else{
                count--;
                if(count!=0){
                    str+=ch;
                }
            }
        }
        return str;
    }
}