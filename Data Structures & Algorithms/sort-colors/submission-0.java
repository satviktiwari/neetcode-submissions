class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for(int n : nums){
            if(n == 0){
                c0++;
            } else if (n == 1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int itr = 0;
        while(c0 > 0){
            nums[itr] = 0;
            itr++;
            c0--;
        }
        while(c1 > 0){
            nums[itr] = 1;
            itr++;
            c1--;
        }
        while(c2 > 0){
            nums[itr] = 2;
            itr++;
            c2--;
        }
    }
}