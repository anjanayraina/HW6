public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Object> l = new DoublyLinkedList<>();

        Object o1  = new Object();
        Object o2  = new Object();
        l.add(o1);
        l.add(o2);

        System.out.println("first : " + o1);
        System.out.println("second : " + o2);
        System.out.println("Iterate 1 ");
        l.iterateList();
        l.remove(o2);
        System.out.println("Itreate 2 : ");
        l.iterateList();
    }
}
