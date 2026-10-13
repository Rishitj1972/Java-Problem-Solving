
import java.util.HashMap;

class IntersectionII {
    public static void main(String[] args) {
        
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums1) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int ans[] = new int[nums1.length];
        int k = 0;
        for(int i=0;i<nums2.length;i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                ans[k] = nums2[i];
                k++;
                map.put(nums2[i],map.get(nums2[i]) - 1);
            }
        }

        for(int i=0;i<k;i++) {
            System.out.println(ans[i]);
        }
    }
}