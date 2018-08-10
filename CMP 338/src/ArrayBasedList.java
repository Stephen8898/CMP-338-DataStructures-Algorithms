
public class ArrayBasedList <I extends Comparable< ? super I >>implements ListInterface<I>  {

	private BetterArray<I> b = new BetterArray<I>(); 
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return  b.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return b.isEmpty();
	}

	@Override
	public void add(I element) {
		// TODO Auto-generated method stub
			b.addElement(element);
	}

	@Override
	public boolean add(I element, int index) {
		// TODO Auto-generated method stub
		return b.insertElement(element, index);
	}

	@Override
	public void addSorted(I element) {
		// TODO Auto-generated method stub
		b.insertElementSorted(element);
	}

	@Override
	public I get(int index) {
		// TODO Auto-generated method stub
		return b.getElement(index);
	}

	@Override
	public I replace(I element, int index) {
		// TODO Auto-generated method stub
		return b.replaceElement( element, index);
	}

	@Override
	public boolean remove (int index) {
		return b.removeElement(index);
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		b.resetArray();
	}

}
