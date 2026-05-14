class RecursiveLL {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	int length(Node head) {
		if (head == null) {
			return 0;
		}

		return 1 + length(head.next);
	}

	Node insertAtLast(Node head, int data) {
		if (head == null) {
			return new Node(data);
		}

		head.next = insertAtLast(head.next, data);
		return head;
	}
}