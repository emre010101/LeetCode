package LinkedList;
import java.util.*;
public class IntersectionofTwoLinkedList {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	HashSet<ListNode> hashed = new HashSet<>();
        while(headA != null) {
        	hashed.add(headA);
        	headA = headA.next;
        }
        while(headB!=null) {
        	if(hashed.contains(headB)) return headB;
        	headB=headB.next;
        }
        return null;
    }

}
