import java.util.*;

class Intersection {
    public static void main(String[] args) {

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] result = new int[num1.length];
        int k = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : num1) {
            set.add(num);
        }

        for(int i=0;i<num2.length;i++) {
            if(set.contains(num2[i])) {
                result[k] = num2[i];
                k++;                         // to remove adding extra array elements, length = num1.length so it add other elements as 0.
                set.remove(num2[i]);        // to remove adding duplicate elements. 
            }
        }

        for(int i=0;i<k;i++) {
            System.out.println(result[i]);
        }
    }
}