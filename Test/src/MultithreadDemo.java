
class MultithreadDemo extends Thread{

	public void run() {
		try {
		System.out.println("Thread " + java.lang.Thread.currentThread().getId() + " is running");
		}
		catch(Exception e){
			System.out.println("");
		} 
	}

	
public static class Thread {
		
		public static void main(String[]  args) {
			
		
			for(int n=0; n<4; n++) {
				
				MultithreadDemo obj = new MultithreadDemo();
				obj.start();
			}
		}
	
	}
	
}