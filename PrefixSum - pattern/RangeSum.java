class RangeSum {
    public static void main(String[] args) {
        
        // int[] nums = {2,4,1,3,5};
        int[] nums = {5,2,7,1,4};
        int left = 0;
        int right = 2;

        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for(int i=1;i<nums.length;i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];  // find the prefixSum
        }

        int ans;

        if(left == 0) {
            ans = prefixSum[right]; // If left == 0, the prefix sum already contains exactly the sum we need.
        } else {
            ans = prefixSum[right] - prefixSum[left - 1];
        }


        System.out.println(ans); // range sum from prefixSum 
    }
}