package listImpl;

public class LengthOfList {

	Node head;

	public void pushData(int data) {

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

	public int getCount() {

		Node tmp = head;
		int count = 0;
		while (tmp != null) {
			tmp = tmp.next;
			count++;
		}
		System.out.println("length of list :--->" + count);
		return count;

	}

	public void show() {
		Node tmp = head;
	//	int count = 0;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}

	public static void main(String[] args) {

		// LinkList list = new LinkList();
		LengthOfList list = new LengthOfList();
		list.pushData(10);
		list.pushData(20);
		list.pushData(30);
		list.pushData(40);
		list.show();
		list.getCount();

	}
}
