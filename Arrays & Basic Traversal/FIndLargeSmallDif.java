class FindLargeSmallDif {
    public static void main(String[] args) {
        
        int arr[] = {10, 5, 25, 8, 15, 2};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            } else {
                smallest = arr[i];
            }
        }

        System.out.println("Difference = "+(largest - smallest));
    }
}