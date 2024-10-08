class Solution {
    public int findPages(int[] nums, int k) {
        int n=nums.length;
        int maxi=0;
        int sum=0;
        if(k>n) return -1;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            sum+=nums[i];
        }
       // int ans=sum;
        if(k==n) return maxi;
        int low=maxi,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(checkAllocation(nums,k,mid,n) <=k){
                //System.out.println("Anand- updating ans ="+ans +" and mid= "+mid);
               // ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    private int checkAllocation(int[] nums, int k, int mid,int n){

        int allotted=1;
        int maxx=0;
        int currSum=0;
        for(int i=0;i<n;i++){
            if(currSum+nums[i]<=mid){
                currSum+=nums[i];

            }else{
                allotted++;
                currSum=nums[i];
            }
        }
        return allotted;

    }
}
