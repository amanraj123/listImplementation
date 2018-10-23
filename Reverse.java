package listImpl;

public class Reverse {

	static Node head;
	static Reverse list;

	public void insertData(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node tmp = head;
			while (tmp.next != null)
				tmp = tmp.next;
			tmp.next = node;
		}

	}

	public void showList() {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data+ " ");
			tmp = tmp.next;
		}
	}

	public Node reverse(Node node) {

		Node prev = null;
		Node curr = node;
		Node ahead = null;
		while (curr != null) {
			ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;

		}
		node = prev;
		System.out.println("\nafter reversing the list");
		//list.showList();
		return node;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list = new Reverse();
		list.insertData(10);
		list.insertData(20);
		list.insertData(30);
		list.insertData(40);
		list.insertData(50);
		list.insertData(60);
		list.insertData(70);

		list.showList();
		
		head=list.reverse(head);
		list.showList();

	}

}
