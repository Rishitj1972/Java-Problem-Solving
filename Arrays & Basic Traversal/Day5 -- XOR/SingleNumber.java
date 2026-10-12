// If a problem says every number appears twice except one, XOR should be one of your first options.

/* This is the actual reason the XOR pattern solves the Single Number problem. 
Every duplicated number cancels out, leaving only the number that occurs once. */

/*
0 ^ 4 = 4
Binary representation
000
100
---
100
XOR with zero leaves the number unchanged. Result = 4.
 */

class SingleNumber {
    public static void main(String[] args) {
        
        int[] nums = {4, 1, 2, 1, 2};
        int answer = 0;

        for(int num : nums) {
            answer  = answer ^ num;
        }

        System.out.println("Single Value in this array is : "+answer);
    }
}