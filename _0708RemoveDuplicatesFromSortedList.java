public class _0708RemoveDuplicatesFromSortedList {
    public static ListNode<Integer> removeDuplicatesFromSortedList(ListNode<Integer> sortedList) {
        ListNode<Integer> uniques = sortedList;
        ListNode<Integer> uniquesHead = uniques;
        while(sortedList.next != null) {
            if (sortedList.next.data != sortedList.data) {
                uniques.next = sortedList.next;
                uniques = uniques.next;
            }
            sortedList = sortedList.next;
        }
        return uniquesHead;
    }

    public static void main(String[] args) {
        ListNode<Integer> sortedList = new ListNode<>(new Integer[]{1,1,1,2,2,2,3,3,3,4,5,6,7,7,8});
        System.out.println(sortedList + " -> " + removeDuplicatesFromSortedList(sortedList));
    }
}