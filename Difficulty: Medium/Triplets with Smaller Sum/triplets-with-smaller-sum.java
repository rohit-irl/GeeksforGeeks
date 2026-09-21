class Solution {
    int countTriplets(int sum, int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int add = arr[left] + arr[right] + arr[i];
                if(add < sum){
                    count = count + (right - left);
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
}