class FindMaximum {
    public static void main(String[] args) {

        int arr[] = {4,2,9,1,7};

        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.println("MaxValue = "+maxValue);
    }
}