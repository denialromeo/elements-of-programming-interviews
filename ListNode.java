public class ListNode<T> {
    public T data;
    public ListNode<T> next;

    @SafeVarargs
    public ListNode(T ... data) {
        this.data = data[0];
        ListNode<T> currentNode = this;
        for (int i = 1; i < data.length; i++) {
            currentNode.next = new ListNode<T>(data[i]);
            currentNode = currentNode.next;
        }
    }

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(ListNode<T> node) {
        this.data = node.data;
        this.next = null;
    }

    public ListNode<T> appendToEnd(ListNode<T> newNode) {
        ListNode<T> currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return this;
    }

    public String toString() {
        ListNode<T> iter = this;
        String asString = "[";
        while(iter != null) {
            asString += iter.data;
            if (iter.next != null) {
                asString += (", ");
            }
            iter = iter.next;
        }
        asString += "]";
        return asString;
    }
}