public class _72ReverseSublist {
    public static ListNode<Integer> reverseList(ListNode<Integer> list) {
        ListNode<Integer> dummyHead = new ListNode<>(0, list);
        ListNode<Integer> newEnd = list;
        while (newEnd.next != null) {
            ListNode<Integer> t = newEnd.next;
            newEnd.next = newEnd.next.next;
            t.next = dummyHead.next;
            dummyHead.next = t;
        }
        return dummyHead.next;
    }

    public static ListNode<Integer> reverseSublist(ListNode<Integer> list, int start, int end) {
        ListNode<Integer> dummyHead = new ListNode<>(0);
        for (int i = 0; i < start; i++) {
            dummyHead.appendToEnd(new ListNode<Integer>(list));
            list = list.next;
        }
        ListNode<Integer> subList = new ListNode<>(0);
        for (int i = 0; i < end - start + 1; i++) {
            subList.appendToEnd(new ListNode<Integer>(list));
            list = list.next;
        }
        dummyHead.appendToEnd(reverseList(subList.next)).appendToEnd(list);
        return dummyHead.next;
    }

    public static void main(String args[]) {
        ListNode<Integer> list = new ListNode<>(new Integer[]{1,2,3,4,5});
        reverseSublist(list, 0, 2).print();
    }
}