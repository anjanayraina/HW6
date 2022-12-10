public interface MyList<T> {

    public void clear();
    public void add(int val , T t);
    public void add(T t);
    public T remove(int index);
    public void remove(T t);
    public boolean isEmpty();
    public T get(int index);
    public int size();
    public int indexOf(T t);
    public boolean contains(T t);
    public String toString();
}
