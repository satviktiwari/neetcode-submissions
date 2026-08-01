class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] ans = new int[m+n];
        int i = 0;
        int j = 0;
        int itr = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                ans[itr] = nums1[i];
                i++;
            } else{
                ans[itr] = nums2[j];
                j++;
            }
            itr++;
        }
        if(i < m){
            for(int k = i; k < m; k++){
                ans[itr] = nums1[k];
                itr++;
            }
        } else{
            for(int k = j; k < n; k++){
                ans[itr] = nums2[k];
                itr++;
            }
        }
        for(int k = 0; k < m+n; k++){
            nums1[k] = ans[k];
        }
    }
}