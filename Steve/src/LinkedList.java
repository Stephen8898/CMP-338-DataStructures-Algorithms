
public class LinkedList {
 Node head;
	

public void shift(int List) {
	Node current = head;
	while (current.pointer != null ) {
		current = current.pointer; 
	}
	
	current.pointer = new Node(List);
}				
				
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}