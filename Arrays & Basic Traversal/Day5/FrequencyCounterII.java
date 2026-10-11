
import java.util.HashMap;

class FrequencyCounterII {

    public static void main(String[] args) {

        String name = "Rishi";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<name.length();i++) {
            map.put(name.charAt(i),map.getOrDefault(name.charAt(i), 0) + 1);
        }

        System.out.println(map);
    }
}