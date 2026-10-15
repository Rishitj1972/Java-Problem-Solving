class ValidPalindromeII {
    public static void main(String[] args) {
        
        String s = "A man, a plan, a canal: Panama";
        
        boolean isPalindrome = true;
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            
            char start = s.charAt(left);
            char end = s.charAt(right);
            
            if(!((start >= 'A' && start <= 'Z') || (start >= 'a' && start <= 'z') || (start >= '0' && start <= '9'))) {
                left++;
                continue;
            }
            if(!((end >= 'A' && end <= 'Z') || (end >= 'a' && end <= 'z') || (end >= '0' && end <= '9'))) {
                right--;
                continue;
            }
            
            if(start >= 'A' && start <= 'Z') {
                start = (char)(start + 32); 
            }
            if(end >= 'A' && end <= 'Z') {
                end = (char)(end + 32); 
            }
            
            if(start != end) {
                isPalindrome = false;
                break;
            }
            
            left++;
            right--;
        }
        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}