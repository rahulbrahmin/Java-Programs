package chegg;

public interface BagInterface<E> {
	public boolean add(E item);
	
	public E[] toArray();
	
	public boolean isFull();
	
	public boolean isEmpty();
	
	public int getCurrentSize();
	
	public int getFrequencyOf(E item);
	
	public boolean contains(E item);
	
	public void clear();
	
	public E remove(int index);
	
	public int getIndexOf(E item);
}
