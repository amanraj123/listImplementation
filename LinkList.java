package listImpl;

public class LinkList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}

	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		// assigning head to next of current new node
		node.next = head;
		head = node;

	}

	public void insertAt(int index, int data) {
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node node = new Node();
			node.data = data;
			node.next = null;

			// traverse for index

			Node tmp = head;

			for (int i = 0; i < index - 1; i++) {
				tmp = tmp.next;
			}
			node.next = tmp.next;
			tmp.next = node;
		}
	}

	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node tmp = head;
			Node nodeTodelete = null;

			for (int i = 0; i < index - 1; i++) {

				tmp = tmp.next;
			}

			// once control comes out of loop , tmp will be @ one node before the node to be
			// deleted
			// node to be deleted will be tmp.next
			// assigning tmp.next [ tmp is a node before the node to be deleted node ] to n
			nodeTodelete = tmp.next;
			// tmp.next = nodeTodelete.next;
			tmp.next = nodeTodelete.next;

			System.out.println("Node to be deleted is tmp.next.data  " + nodeTodelete.data);

		}
	}

	public void size() {
		int count = 0;
		Node tmp = head;
		if (tmp == null) {
			System.out.println("size is zero ");
		} else {
			while (tmp != null) {
				tmp = tmp.next;
				++count;
			}
			System.out.println("size of list is " + count);
		}
	}

	public void show() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	public void createLoop() {
		
	}
}
