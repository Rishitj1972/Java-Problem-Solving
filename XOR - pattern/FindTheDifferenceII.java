class FindTheDifferenceII {
    public static void main(String[] args) {
        
        String s = "abcd";
        String t = "acbde";

        char ch = 0;  // ans = 0 because zero is the starting value that allows XOR to work correctly.

        for(int i=0;i<s.length();i++) {
            ch ^= s.charAt(i);
        }

        for(int j=0;j<t.length();j++) {
            ch ^= t.charAt(j);
        }

        System.out.println("Newly added character = "+ch);
    }
}