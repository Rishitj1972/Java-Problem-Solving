class ReverseAnArray {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int t;
            t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;

            left++;
            right--;
        }

        for(int num : arr) {
            System.out.println(num);
        }
    }
}