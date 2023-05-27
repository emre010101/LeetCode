package easy;

/**
 * Definition for singly-linked list.*/
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
  
  //my Solution
   class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null) return head;
        ListNode temp = head.next;
        ListNode pre = head;
        while(temp!=null) {
        	if(pre.val == temp.val) {
        		pre.next = temp.next;
        		temp = temp.next;
        	}else {
        		pre = temp;
        		temp = temp.next;
        	}
        }
        return head;
    }
    
    //LeetCode solution
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode list = head;         
        while(list != null) {
            if (list.next == null) break; 
            if (list.val == list.next.val) list.next = list.next.next;
            else list = list.next;
        }         
        return head;
    }
}