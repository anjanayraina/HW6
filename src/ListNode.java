public class ListNode<T> {

    T data;

    ListNode<T> next;
    ListNode<T> previous;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public ListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }
    ListNode()
    {

        this.data = null;
        this.next = null;
        this.previous = null;

    }

    ListNode(T data)
    {

        this.data = data;
        this.next = null;
        this.previous = null;

    }
    ListNode(T data , ListNode<T> next , ListNode<T> previous)
    {


        this.data = data;
        this.next = next;
        this.previous = previous;

    }
}
