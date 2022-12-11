public class DoublyLinkedList<T> implements MyList<T> {
    @Override
    public void clear() {

    }

    @Override
    public void add(int val, T t) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }


    private class ListNode<T> {
        private T value;
        private ListNode<T> prev;
        private ListNode<T> next;

        public ListNode(T value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }


    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;


    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    @Override
    public void add(T value) {

        ListNode<T> newNode = new ListNode<>(value);


        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }


        this.size++;
    }

    public void iterateList(){
        ListNode<T> temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    @Override
    public void remove(T value) {

        if (this.head == null) {
            System.out.println("Head is null");
            return;
        }


        if (this.head.value.equals(value)) {
            this.head = this.head.next;
            if (this.head != null) {
                this.head.prev = null;
            }
            this.size--;
            return;
        }


        if (this.tail.value.equals(value)) {
            this.tail = this.tail.prev;
            if (this.tail != null) {
                this.tail.next = null;
            }
            this.size--;
            return;
        }


        ListNode<T> current = this.head;
        while (current.next != null) {
            if (current.next.value.equals(value)) {
                current.next = current.next.next;
                current.next.prev = current;
                this.size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

}

