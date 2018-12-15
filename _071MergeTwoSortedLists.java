public class _071MergeTwoSortedLists {
    public static ListNode<Integer> mergeTwoSortedLists(ListNode<Integer>sortedList1, ListNode<Integer>sortedList2) {
        ListNode<Integer> dummyHead = new ListNode<>(0);
        ListNode<Integer> current = dummyHead;
        while (sortedList1 != null && sortedList2 != null) {
            if (sortedList1.data <= sortedList2.data) {
                current.next = sortedList1;
                sortedList1 = sortedList1.next;
            }
            else {
                current.next = sortedList2;
                sortedList2 = sortedList2.next;
            }
            current = current.next;
        }
        if (sortedList1 == null) {
            current.next = sortedList2;
        } 
        else {
            current.next = sortedList1;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode<Integer> sortedList1 = new ListNode<>(new Integer[]{1,2,5,11});
        ListNode<Integer> sortedList2 = new ListNode<>(new Integer[]{3,6,12});
        System.out.println(sortedList1 + " + " + sortedList2 + " = " + mergeTwoSortedLists(sortedList1, sortedList2));
    }
}