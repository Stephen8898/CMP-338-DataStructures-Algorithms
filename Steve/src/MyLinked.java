
public class MyLinked {

	
	String myinfo; // Info field of node 
	MyLinked pointer; // declare Pointer field of node
	
	
	MyLinked() {
		this.pointer = null;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyLinked firstNode = new MyLinked();
		
		MyLinked secondNode = new MyLinked();
		
		MyLinked thirdNode = new MyLinked();
		
		MyLinked fourthNode = new MyLinked();
		
		//Create data for info fields of the node
		
		firstNode.myinfo = "hello";
		secondNode.myinfo = "Darkness";
		thirdNode.myinfo = "my";
		fourthNode.myinfo = "Old Friend";
		
		// Use the Pointer field of the node
		
		firstNode.pointer = secondNode;
		secondNode.pointer = thirdNode;
		thirdNode.pointer = fourthNode;
		fourthNode.pointer = null;
		

			while(firstNode != null) {
				System.out.print(firstNode.myinfo + "--> ");
				firstNode = firstNode.pointer;
			}	
	
	System.out.print("null");
		
	}

}
