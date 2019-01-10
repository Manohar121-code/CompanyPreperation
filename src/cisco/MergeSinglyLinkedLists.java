package cisco;

public class MergeSinglyLinkedLists {
	public static void main(String[] args) {
		MergeSinglyLinkedLists obj = new MergeSinglyLinkedLists();
		int[] arr1 = {11, 45, 65, 23, 89, 45, 78};
		int[] arr2 = {90, 12, 49, 66, 35, 97, 37, 22, 19, 50};
		LLNode head1 = obj.fillLLFromArray(arr1);
		LLNode head2 = obj.fillLLFromArray(arr2);
		long s = System.nanoTime();
		LLNode result = obj.doOperation(head1, head2);
		long e = System.nanoTime();
		System.out.println(e-s);
		obj.printLL(result);
	}

	private LLNode doOperation(LLNode head1, LLNode head2) {
		LLNode result = head1;
		LLNode nextNode2 = null, currHead1 = null, currHead2 = null;
		while (head1 != null) {
			currHead1 = head1;
			LLNode nextNode1 = head1.next;
			if (currHead2 != null) currHead2.next = head1;currHead2 = null;
			if (head2 != null) {
				nextNode2 = head2.next;
				head2.next = null;
				head1.next = head2;
				currHead2 = head2;
				head2 = nextNode2;
			}
			head1 = nextNode1;
		}
		if (nextNode2 != null) {
			while (currHead1 != null && currHead1.next != null) {
				currHead1 = currHead1.next;
			}
			currHead1.next = nextNode2;
		}
		return result;
	}

	private void printLL(LLNode head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	private LLNode fillLLFromArray(int[] arr) {
		LLNode head = new LLNode(arr[0]);
		LLNode prev = head;
		for (int i = 1; i < arr.length; i++) {
			LLNode curr = new LLNode(arr[i]);
			prev.next = curr;
			prev = curr;
		}
		return head;
	}
}

class LLNode {
	int data;
	LLNode next;
	public LLNode(int data) {
		this.data = data;
	}
}