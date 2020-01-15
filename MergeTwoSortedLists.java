public class MergeTwoSortedLists {

  public static class ListNode<T> {
    public T data;
    public ListNode<T> next;

    public ListNode(T ... data) {
      this.data = data[0];
      ListNode<T> current = this;
      for (int i = 1; i < data.length; i++) {
        current.next = new ListNode<T>(data[i]);
        current = current.next;
      }
    }
  }

  public static void main(String[] args) {
    ListNode<Integer> list1 = new ListNode<Integer>(1,3,5,7);
    ListNode<Integer> list2 = new ListNode<Integer>(1,2,4,5,6);
    ListNode<Integer> answer = new ListNode<Integer>(0);
    ListNode<Integer> finalAnswer = answer;

    while (list1 != null && list2 != null) {
      if (list1.data >= list2.data) {
        answer.next = list2;
        list2 = list2.next;
      }
      else {
        answer.next = list1;
        list1 = list1.next;
      }
      answer = answer.next;
    }
    
    if (list1 != null) { answer.next = list1; }
    else { answer.next = list2; }

    finalAnswer = finalAnswer.next;
    while (finalAnswer != null) {
      System.out.println(finalAnswer.data);
      finalAnswer = finalAnswer.next;
    }
  }
}