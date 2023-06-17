package samplepackage;

public class ListNodeAddTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1n3 = new ListNode(3);
		ListNode l1n2 = new ListNode(4,l1n3);
		ListNode l1n1 = new ListNode(2,l1n2);
		
		ListNode l2n3 = new ListNode(4);
		ListNode l2n2 = new ListNode(6,l1n3);
		ListNode l2n1 = new ListNode(5,l1n2);

		ListNode result = addTwoNumbers(l1n1, l2n1);
		
		
	}
	
	static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int l1Size = size(l1);
		int l2Size = size(l2);
		int length = Math.max(l1Size, l2Size);
		while (l1.next != null && l2.next != null) {
			
		}
		
		System.out.println(length);
		return null;
	}
	
	static public int size(ListNode l) {
		if (null == l) {
			return 0;
		}
		int size=1;
		while (l.next != null) {
			l = l.next;
			size++;
		}
		return size;
	}
}
