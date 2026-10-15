class ReverseCharArray {
    public static void main(String[] args) {
        
        char s[] = {'h','e','l','l','o'};

        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char t;
            t = s[left];
            s[left] = s[right];
            s[right] = t;

            left++;
            right--;
        }
        System.out.println(s);
    }
}