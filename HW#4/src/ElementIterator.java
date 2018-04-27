import java.util.Iterator;
import java.util.Vector;

public class ElementIterator<E> implements Iterator<E> {

	private Vector<E> elements;
	
	
	public ElementIterator(Vector<E> elements) {
		this.elements = elements;
	}
	
	@Override
	public boolean hasNext() {
		if (elements.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public E next() {
		E element = this.elements.firstElement();
		elements.removeElementAt(0);
		return element;
	}

}
