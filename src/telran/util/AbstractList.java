package telran.util;

import java.util.NoSuchElementException;

public abstract class AbstractList<T> implements List<T> {
	protected int size;
	protected boolean flagNext = false;

	@Override
	public int size() {
		
		return size;
	}
	
	protected boolean isValidIndex(int index) {
		
		return index >= 0 && index < size;
	}
	
	protected void noSuchElementException() {
		throw new NoSuchElementException();
	}
	
	protected void illegalStateException() {
		throw new IllegalStateException();
	}
}
