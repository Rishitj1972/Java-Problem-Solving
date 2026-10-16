
import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 5, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 4, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] temp = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        for (int x = 0; x < m + n; x++) {
            nums1[x] = temp[x];
        }
    }
}
