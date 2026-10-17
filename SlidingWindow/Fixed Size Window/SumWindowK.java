// Calculate the sum of every contiguous subarray of size k.
// Calculate the first window's sum, then subtract the outgoing element and add the incoming element.

class SumWindowK {
    public static void main(String[] args) {
        
        int[] arr = {2,4,6,8,10};
        int k = 3;

        int sum = 0;

        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        for(int i=k;i<arr.length;i++) {
            sum = sum + arr[i] - arr[i - k];
            System.out.println(sum);
        }
    }
}