class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1) return 0;
        // if(n==2){
        //     if(nums[0]>nums[1]) return 0;
        //     else return 1;
        // }
        int ans=-1;
        if(nums[0]>nums[1])return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        // using binaru search

        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;

            // agar humara peak left me hoga , (Jab humara mid downward curve me hoga)
            // downward curve me hone ke liye mid-1 wala mid se bada hoga
            if(nums[mid]<nums[mid-1])high=mid-1;
            else low=mid+1;

        }
        return -1;
    }
}
