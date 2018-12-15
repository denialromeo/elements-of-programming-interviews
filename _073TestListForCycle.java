public class _073TestListForCycle {
    public static boolean testForCycle(ListNode<Integer> list) {
        ListNode<Integer> head = list;
        list = list.next;
        for (int i = 1; list != null; i++, list=list.next) {
            ListNode<Integer> headCopy = head;
            for (int j = 0; j < i; j++) {
                if (headCopy.equals(list)) {
                    return true;
                }
                headCopy = headCopy.next;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode<Integer> list = new ListNode<>(new Integer[]{1,2});
        list.next.next = list;
        System.out.println(testForCycle(list));
    }
}