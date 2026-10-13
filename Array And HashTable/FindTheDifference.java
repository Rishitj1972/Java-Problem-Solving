
import java.util.HashMap;

class FindTheDifference {
    public static void main(String[] args) {
        
        String s = "abcd";
        String t = "acbde";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }

        char newCh = ' ';

        for(int i=0;i<t.length();i++) {
            
            char ch = t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch,map.get(ch) - 1);
            } else {
                newCh = ch;
            }
        }

        System.out.println("Extra Added element is = "+newCh);
    }
}

//Notes
// map.get(key) returns the value associated with that key in a HashMap.
/*
map.containsKey(ch) checks whether the key exists.

map.get(ch) > 0 checks whether any occurrences remain.

map.put(ch, map.get(ch) - 1) consumes one occurrence.

If no occurrences remain, the current character is the extra character.
 */