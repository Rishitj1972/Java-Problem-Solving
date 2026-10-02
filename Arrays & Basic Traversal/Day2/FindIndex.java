class FindIndex {
    public static void main(String[] args) {

        int arr[] = {10, 25, 7, 18, 30};
        int target = 18;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                System.out.println(arr[i]+" Found at "+"index : "+i);
            }
        }
    }
}