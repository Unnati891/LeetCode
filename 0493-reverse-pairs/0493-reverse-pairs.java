class Solution {
    public void merge(int left,int right,int mid,int nums[]){
        int ans[]=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(nums[i]>nums[j]){
                ans[k]=nums[j];
                k++;
                j++;
            }else{
                ans[k]=nums[i];
                k++;
                i++;
            }
        }
        while(i<=mid){
            ans[k] = nums[i];
            k++;
            i++;
    }
        while(j<=right){
            ans[k]=nums[j];
            k++;
            j++;
    }
    for(int a=0;a<ans.length;a++){
        nums[left+a]=ans[a];
    }
    }

private int countPairs(int nums[],int left,int mid,int right){
        int count=0;
        int j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)nums[i]>2* (long)nums[j]){
                j++;
            }
            count+=j-(mid+1); //number of valid elements = stopping point - starting point
        }
        return count;
    }
    public int mergeSort(int left,int right,int nums[]){
        if(left>=right){
            return 0;
        }
        int mid=(left+right)/2;
        int leftCount=mergeSort(left,mid,nums);
        int rightCount=mergeSort(mid+1,right,nums);
        int countCross=countPairs(nums,left,mid,right);
        merge(left,right,mid,nums);
        return leftCount+rightCount+countCross;
    }
    public int reversePairs(int[] nums) {
        int left=0;
        int right=nums.length-1;
        return mergeSort(left,right,nums);
    }
}