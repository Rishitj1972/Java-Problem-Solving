class RemoveElement {
    public static void main(String[] args) {
        
        int[] nums = {3,2,2,3};
        int val = 3;

        int idx = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        System.out.println("No of values after removal of element = "+idx);
    }
}