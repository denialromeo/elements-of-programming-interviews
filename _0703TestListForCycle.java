public class _0703TestListForCycle {
    public static boolean listHasCycle(ListNode<Integer> list) {
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
        if (listHasCycle(list)) {
            System.out.println("The list has a cycle in it!");
        }
        else {
            System.out.println(list + " has no cycle.");
        }
    }
}