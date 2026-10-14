class Pgm1 {
    public static void main(String[] args) {

        int arr[] = {2,4,1,3,5};
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for(int i=1;i<arr.length;i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for(int num : prefixSum) {
            System.out.println(num);
        }
    }
}

/*
prefixSum[i - 1] — the sum calculated up to the previous index.
arr[i] — the current element.
prefixSum[i] — the new cumulative sum.
 */