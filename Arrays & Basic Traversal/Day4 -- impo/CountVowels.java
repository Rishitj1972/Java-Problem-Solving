// Without printing duplicates

public class CountVowels
{
	public static void main(String[] args) {
	    
	    String name = "Rishi";
	   
	    
	    for(int i=0;i<name.length();i++) {
	        
	        boolean alreadyCounted = false;
	    
    	    for(int k=0;k<i;k++) {
    	        if(name.charAt(i) == name.charAt(k)) {
    	            alreadyCounted = true;
    	            break;
    	        }
    	    }
    	    
    	    if(alreadyCounted) {
    	        continue;
    	    }
	        
	        char ch = name.charAt(i);
	        
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                
                int count = 0;
                    
                for(int j=0;j<name.length();j++) {
                    if(name.charAt(i) == name.charAt(j)) {
                        count++;
                    }
                }
                System.out.println("vowel "+name.charAt(i)+" appears "+count+" times");
            }
	    }
	}
}