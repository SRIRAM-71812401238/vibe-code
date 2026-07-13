class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int num:nums){
            int value=0;
            while(num>0){
                value++;
                num /=10;
            }
                if(value%2==0){
                    count++;
            }
        }
        return count;
    }
}