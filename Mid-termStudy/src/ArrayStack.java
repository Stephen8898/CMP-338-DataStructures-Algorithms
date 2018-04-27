import java.util.Iterator;
import java.util.Vector;

public class ArrayStack<E> implements StackInterface<E> {

	private Vector<E> v = new Vector<E>();
	private final int INV_STACK_PTR= -1;
	private int stackPtr = INV_STACK_PTR;
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return v.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return v.size();
	}

	@Override
	public void push(E e) throws IllegalStateException, NullPointerException {
		// TODO Auto-generated method stub
		v.add(++stackPtr, e);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pop() {
		E elem = null;
		if(stackPtr != INV_STACK_PTR) {
			elem = (E)v.elementAt(stackPtr);
			v.removeElementAt(stackPtr);
			
			stackPtr--;
		}
		return elem;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		v.clear();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		
		return (Iterator<E>) v.iterator(); 
	}

}
