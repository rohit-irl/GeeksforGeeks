class Solution {
    public int nthDay(int d, int n) {
        int res = 0;
        n = n % 7;
        if(n <= d){
            res = d - n;
        }else{
            res = 7 - n;
            res = res +d;
        }
        return res;
    }
}