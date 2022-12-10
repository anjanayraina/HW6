public class LinkedList<T> implements MyList<T>{
    private ListNode<T> first;
   private ListNode<T> last;
   private int length;
   LinkedList(){
       first = null;
       last =  null;
   }

    @Override
    public void clear() {
       first = new ListNode<T>();
       last = new ListNode<T>();
    }

    @Override
    public void add(T data)
    {

        ListNode<T> temp = new ListNode<>(data);
        if (this.first == null) {
            first = temp;
            length++;
            return ;
        }

            ListNode<T> X = first;

            while (X.next != null) {
                X = X.next;
            }

            X.next = temp;

        length++;
    }

    @Override
    public void add(int position, T data)
    {

        if (position > length + 1) {


          throw new IndexOutOfBoundsException(
                    "List index is out of bound");

        }


        if (position == 1) {


            ListNode<T> temp = first;


            first = new ListNode<T>(data);


            first.next = temp;
            temp.previous =
            temp.next.previous = first;

            return;
        }


        ListNode<T> temp = first;


        ListNode<T> prev = new ListNode<T>(null);

        while (position - 1 > 0) {

            prev = temp;

            temp = temp.next;

            position--;
        }

        prev.next = new ListNode<T>(data);

        prev.next.next = temp;
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
        while(temp.next != null){
            if(temp.getData() == t)return index ;
            index++;
        }

        return -1;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }
}
