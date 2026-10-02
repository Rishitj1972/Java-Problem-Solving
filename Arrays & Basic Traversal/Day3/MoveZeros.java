class MoveZeros {
    public static void main(String[] args) {
        
        int arr[] = {0,1,0,3,12};

        int left = 0; // maintaining a position/index while traversing an array.

        for(int right = 0;right<arr.length;right++) {
            if(arr[right] != 0) {
                int t;
                t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;

                left++;
            }
        }

        for(int num : arr) {
            System.out.println(num);
        }
    }
}