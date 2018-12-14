public class ListNode<T> {
    public T data;
    public ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(ListNode<T> node) {
        this.data = node.data;
        this.next = null;
    }

    public ListNode(T[] data) {
        this.data = data[0];
        ListNode<T> currentNode = this;
        for (int i = 1; i < data.length; i++) {
            currentNode.next = new ListNode<T>(data[i]);
            currentNode = currentNode.next;
        }
    }

    public void append(ListNode<T> newNode) {
        newNode.next = this.next;
        this.next = newNode;
    }

    public ListNode<T> appendToEnd(ListNode<T> newNode) {
        ListNode<T> currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return this;
    }

    public void deleteNextNode() {
        this.next = this.next.next;
    }

    public ListNode<T> search(T key) {
        for (ListNode<T> l = this; l != null; l = l.next) {
            if (l.data == key) {
                return l;
            }
        }
        return null;
    }

    public void print() {
        ListNode<T> dummy = this;
        while(dummy != null) {
            System.out.println(dummy.data);
            dummy = dummy.next;
        }
    }
}