
import java.util.HashSet;

class Method1 {
    
    HashSet<Integer> set = new HashSet<>();

    public int withHashSet(int arr[]) {
        
        for(int num : arr) {
            if(set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}

class Method2 {

    public int withoutHashSet(int arr[]) {

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<i;j++) { // important
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}


class FindDuplicate {
    public static void main(String[] args) {
        
        int arr[] = {4, 2, 7, 2, 5, 4};

        Method1 m = new Method1();
        int result1 = m.withHashSet(arr);
        System.out.println("Result 1 = "+result1);

        Method2 m1 = new Method2();
        int result2 = m1.withoutHashSet(arr);
        System.out.println("Result 2 = "+result2);

    }
}