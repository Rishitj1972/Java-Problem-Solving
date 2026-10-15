class IsSubsequence {
    public static void main(String[] args) {
        
        String s = "abc";
        String t = "ahbcd";

        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;
        
        if(tIndex == 0) {
            System.out.println("Subsequence ");
        }

        while(sIndex >= 0 && tIndex >=0 ) {
            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex--;
            }
            tIndex--;
        }
        
        if(sIndex < 0) {
            System.out.println("Is SubSequence");
        } else {
            System.out.println("Not SubSequence");
        }
    }
}