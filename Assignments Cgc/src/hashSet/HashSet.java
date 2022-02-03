package hashSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
  
public class HashSetImpl<T> {
    private Set<T> hashSet;
  
    // creating a set containing the elements in the
    // specified collection
    public HashSetImpl(Collection<? extends T> c)
    {
        hashSet = new HashSet<T>(c);
    }
  
    // constructing a set with given initialcapacity and
    // loadfactor
    public HashSetImpl(int initialCapacity,float loadFactor)
    {
        hashSet = new HashSet<T>(initialCapacity, loadFactor);
    }
  
    // specified initial capacity and default load factor
    // (0.75).
  
    public HashSetImpl(int initialCapacity)
    {
        hashSet = new HashSet<T>(initialCapacity);
    }
    
    // creating a new hashset with default capacity
    // 16 and load factor 0.75
    public HashSetImpl() { hashSet = new HashSet<T>(); }
  
    // returns an iterator over the elements in the set
    public Iterator<T> iterator()
    {
        return hashSet.iterator();
    }
  
    // adding the element into the hashset
    public boolean add(T eobj) { return hashSet.add(eobj); }
  
    // return true if this set contains the specified
    // element
    public boolean contains(Object obj)
    {
        return hashSet.contains(obj);
    }
  
    // returns true if the set is empty
    public boolean isEmpty() { return hashSet.isEmpty(); }
  
    // removes the specified element from this set if
    // present
    public boolean remove(Object obj)
    {
        return hashSet.remove(obj);
    }
  
    // returns the number of elements in set
    public int size() { return hashSet.size(); }
  
    // removes all elements from this set
    public void clear() { hashSet.clear(); }
  
    // Returns an array with all of the elements in this
    // set.
    public Object[] toArray() { return hashSet.toArray(); }
  
    // Adds all of the elements in the specified collection
    // to this set if
    // they're not already present
  
    public boolean addAll(Collection<? extends T> c)
               throws UnsupportedOperationException,
               ClassCastException, NullPointerException,
               IllegalArgumentException
    {
        return hashSet.addAll(c);
    }
  
    // Retains only the elements in this set that are
    // contained in the specified
    // collection
  
    public boolean retainAll(Collection<?> c)
               throws UnsupportedOperationException,
               ClassCastException, NullPointerException
    {
        return hashSet.retainAll(c);
    }
  
    // Removes from this set all of its elements that are
    // contained in the specified collection
  
    public boolean removeAll(Collection<?> c)
               throws UnsupportedOperationException,
               NullPointerException, ClassCastException
    {
        return hashSet.retainAll(c);
    }
  
    // Returns an array containing all of the elements in
    // this set; the runtime
    // type of the returned array is that of the specified
    // array
  
    public <T> T[] toArray(T[] a)
        throws ArrayStoreException, NullPointerException
    {
        return hashSet.toArray(a);
    }
}
