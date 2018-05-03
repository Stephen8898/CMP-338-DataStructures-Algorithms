import java.util.Vector;

public class Driver implements DriverInterface {

	@Override
	public Vector<TreeItem<Integer, String>> getVectorOfTreeItems() {
		// TODO Auto-generated method stub
		Vector<TreeItem<Integer, String>> itemVec = new Vector<TreeItem<Integer, String>>();
		
		int itemCount = 131071;
		
		for(int i = 0; i < itemCount; i++) {
			
			Integer itemInt = (int)(Math.random()* 1500000);
			
			String itemString = "String "+ itemInt;
			
		TreeItem<Integer, String> newItem = new TreeItem<Integer, String>(itemInt,itemString);
			
		itemVec.add(newItem);
			
		}
		return itemVec;
	}

	@Override
	public BinarySearchTree<Integer, String> createAndPopulateBST(Vector<TreeItem<Integer, String>> treeItems) {
		// TODO Auto-generated method stub
		BinarySearchTree<Integer, String>  bsTree = new BinarySearchTree<Integer, String>();
		 
			for(TreeItem<Integer, String> newItem : treeItems) {
				bsTree.insert(newItem);
			}
		
		return bsTree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
