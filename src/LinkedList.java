import java.util.List;

public class LinkedList<T> implements MyList<T>{
    private ListNode<T> first;
   private ListNode<T> last;
   private int length;
   LinkedList(){
       first = null;
       last =  null;
   }

    public ListNode<T> getFirst() {
        return first;
    }

    public void setFirst(ListNode<T> first) {
        this.first = first;
    }

    public ListNode<T> getLast() {
        return last;
    }

    public void setLast(ListNode<T> last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void clear() {
       first = new ListNode<T>();
       last = new ListNode<T>();
    }

    @Override
    public void add(T data)
    {
//
//        ListNode<T> temp = new ListNode<>(data);
//        if (this.last == null) {
//            first = temp;
//            length++;
//            return ;
//        }
//
//            ListNode<T> X = last;
//
//            while (X.getNext() != null) {
//                X = X.getNext();
//            }
//
//            X.setNext(temp);
//            temp.setPrevious(X);
//            temp.setNext(null);


        ListNode<T> newnode=new ListNode<T>(data);
        if(last==null){
            first=newnode;
            last=newnode;
            newnode.setNext(null);
            newnode.setPrevious(null);
        }else{
            newnode.setPrevious(last);
            last.setNext(newnode);
            last=newnode;
        }
        length++;
    }

    @Override
    public void add(int position, T data)
    {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void remove(T t) {

    }

    @Override
    public boolean isEmpty() {
        if(first == null)return true;
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public int indexOf(T t) {
        ListNode<T> temp = first;
        int index=0;
        while(temp.getNext() != null){
            if(temp.getData() == t)return index ;
            index++;
        }

        return -1;
    }

    @Override
    public boolean contains(T t) {
        ListNode<T> temp = first;
        int index=0;
        while(temp.getNext() != null){
            if(temp.getData() == t)return true ;
            index++;
        }

        return false;
    }
}
