public class FrequencyCounter
{
	public static void main(String[] args) {
	    
	    String name = "applee";
	    
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
	        
	        
	        int count = 0;
	        
	        for(int j=0;j<name.length();j++) {
	            if(name.charAt(i) == name.charAt(j)) {
	                count++;
	            }
	        }
	        System.out.println(name.charAt(i)+" apears "+count+" times");
	    }
	}
}