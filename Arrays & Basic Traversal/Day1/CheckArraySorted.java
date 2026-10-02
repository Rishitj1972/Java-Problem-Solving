class CheckArraySorted {
    public static void main(String[] args) {

        int arr[] = {2, 4, 3, 8, 10};

        boolean isSorted = true;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i - 1] >= arr[i]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}