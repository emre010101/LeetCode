package LinkedList;
import java.util.*;

	/**
	 * Definition for singly-linked list.*/
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	 public class LinkedListCycle {
	
		 //my sol
	    public boolean hasCycle(ListNode head) {
	        if(head==null || head.next==null ) return false;
	        HashSet<ListNode> lili = new HashSet<>();
	        lili.add(head);
		    while(head !=null) {
		    	if(head.next==null) return false;
		    	int pre = lili.size();
		    	head=head.next;
		    	lili.add(head);
		    	if(pre == lili.size()) return true;
		    }
		    return false;
	    }

	 //LeetCode
	    public boolean hasCycle2(ListNode head) {
	        ListNode slow=head, fast=head;
	        while(fast!=null && fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	            if(fast==slow) return true;
	        }
	        return false;
	        
	    }
	    
		}

