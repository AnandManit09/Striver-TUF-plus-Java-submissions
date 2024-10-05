class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=1,high=1;;
        for(int i=0;i<n;i++){
            high=Math.max(high,bloomDay[i]);

        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(checkBloom(bloomDay,mid,k,m)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return ans;
    }
    private boolean checkBloom(int[] bloomDay, int mid, int k, int m){
        int n=bloomDay.length;
        boolean[] bloomed=new boolean[n];
        int currStreak=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                bloomed[i]=true;
                 currStreak+=1;
                if(currStreak==k){
                    m-=1;
                    currStreak=0;
                }
                if(m==0)return true;
            }else{
                currStreak=0;
            }
        }
        return m==0;

    }
}