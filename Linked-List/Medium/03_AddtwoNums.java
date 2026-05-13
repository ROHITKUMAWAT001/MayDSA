class AddTwoNums {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node add(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}

		Node t1 = head1;
		Node t2 = head2;
		Node prev = null;
		int carry = 0;

		while (t1 != null && t2 != null) {
			int sum = t1.data + t2.data + carry;
			t1.data = sum % 10;
			carry = sum / 10;

			prev = t1;
			t1 = t1.next;
			t2 = t2.next;
		}

		if (prev == null) {
			return head1;
		}

		if (t1 == null && t2 != null) {
			prev.next = t2;
			t1 = t2;
		}

		while (t1 != null && carry != 0) {
			int sum = t1.data + carry;
			t1.data = sum % 10;
			carry = sum / 10;

			prev = t1;
			t1 = t1.next;
		}

		if (carry != 0) {
			prev.next = new Node(carry);
		}

		return head1;
	}
}