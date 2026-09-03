class Solution {
    public void removeCharacter(StringBuilder s, char c) {
        remove(s, c, 0);
    }
    public void remove(StringBuilder s, char c, int i){
        if(i == s.length()){
            return;
        }
        if(s.charAt(i) == c){
            s.deleteCharAt(i);
            remove(s, c, i);
        }else{
            remove(s, c, i + 1);
        }
    }
}