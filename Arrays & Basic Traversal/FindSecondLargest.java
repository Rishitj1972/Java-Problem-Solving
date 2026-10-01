class FindSecondLargest {
    public static void main(String[] args) {
        
        int arr[] = {10,5,8,20,15,30,25};

        int maxValue = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > maxValue) {
                secondLargest = maxValue;
                maxValue = arr[i];
            } else if(arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Number = "+secondLargest);
    }
}