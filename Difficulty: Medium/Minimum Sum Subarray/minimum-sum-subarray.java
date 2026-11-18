class Solution {
    public int minSubarraySum(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        int lessend = arr[0];
        for(int i = 1; i < n; i++){
            int v1 = lessend + arr[i];
            int v2 = arr[i];
            lessend = Math.min(v1, v2);
            res = Math.min(res, lessend);
        }
        return res;
    }
}