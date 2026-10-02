
import java.util.HashSet;

class RemoveDuplicates {
    public static void main(String[] args) {
        
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(!set.contains(num)) {
                set.add(num);
            }
        }
        System.out.println(set);
    }
}