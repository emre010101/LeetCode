package LinkedList;
import java.util.*;
public class IntersectionofTwoLinkedList {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	HashSet<ListNode> first = new HashSet<>();
        while(headA != null && headB != null) {
        	int preSize = first.size();
        	first.add(headA); first.add(headB);
        	if(first.size()-2 != preSize) return headA;
        	headA = headA.next; headB=headB.next;
        }
        return null;
    }

}
