package easy;

public class MergeTwoSortedList {
	
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode tobe = new ListNode();
		ListNode dummy = tobe;
		while(list1!=null && list2!=null) {
			if(list1.val < list2.val) {
				tobe.next = list1;
				list1=list1.next;
			}else {
				tobe.next = list2;
				list2 = list2.next;
			}
			tobe = tobe.next;
		}
		while(list1!=null) {
			tobe.next = list1;
			tobe = tobe.next;
			list1=list1.next;
		}
		while(list2!=null) {
			tobe.next = list2;
			tobe = tobe.next;
			list2 = list2.next;
		}
		return dummy.next;
    }
    
}

 class ListNode {
    int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { 
    	 this.val = val; 
    	 }
     ListNode(int val, ListNode next) { 
    	 this.val = val; this.next = next; 
    	 }
 }
