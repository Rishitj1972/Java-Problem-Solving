class ReverseVowels {
    public static void main(String[] args) {

        String s = "IcecreAm";

        char[] c = s.toCharArray(); // convert the String into character array to fetch each character later convert to String
        int left = 0;
        int right = c.length - 1;

        while(left < right) {
            char leftChar = c[left];
            char rightChar = c[right];

            if(!isVowel(leftChar)) {
                left++;
                continue;
            }

            if(!isVowel(rightChar)) {
                right--;
                continue;
            }

            char t;
            t = c[left];
            c[left] = c[right];
            c[right] = t;

            left++;
            right--;
        }

        System.out.println("Reverse Vowels String = "+new String(c));  
        // we use new String(c) because String is a class, and new creates an object using its constructor.
    }

    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
    /*
    The parameter ch receives 'a'.
    indexOf('a') returns 5.
    Java evaluates 5 != -1, which is true.
    return true sends that result back to the calling code.
    The variable result receives true.
     */

    // OR

    @SuppressWarnings("unused")
    private static boolean isVowel2(char ch) {
        return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' ||
                ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' ||
                ch == 'U' ||  ch == 'u';
    } 
}