import java.util.Iterator;

public class TestStack {
	
	private static void showQueue(ArrayBasedStack<String> abq) {
		Iterator<String> myIterator = abq.iterator();
		
		String s = new String("{");

		while (myIterator.hasNext()) {
			s = s + myIterator.next();
			if (myIterator.hasNext()) {
				s = s + ", ";
			}
		}
		s = s + "}";
		
		System.out.println(s);
	}
	

	public static void main (String[] args) {
		ArrayBasedStack abs = new ArrayBasedStack();
		
		for ( int i = 1 ; i < 50 ; i++ ) {
			String s = new String("Element " + i);
			abs.push(s);
		}
		
		showQueue(abs);
		
		String s = (String) abs.pop();
		System.out.println(s);
		
		showQueue(abs);
		
		//s = abs.pop();
	//	System.out.println(s);
		
	//	showQueue(abs);
		
		//s = abs.pop();
		//System.out.println(s);
		
	//	showQueue(abs);
		
		/*
		for ( int i = 50 ; i < 104 ; i++ ) {
		String	s = new String("Element " + i);
			abs.push(s);
		}
		
		showQueue(abs);
	*/
	}
	

    static String findNumber(int[] arr, int k) {
    	 String s = null;
        for(int i = 0; i < arr.length; i++){
          
            if(k != arr[i]){
                s = "NO";
           } else { s = "YES";}
        }
           
        return s;
    
	        
	 }
}
