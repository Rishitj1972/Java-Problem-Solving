class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = s.length() - 1;
        
        boolean isPalindrome = true;
        
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                
            } else {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}