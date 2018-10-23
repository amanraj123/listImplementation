package listImpl;

/*
 * Input:  10->15->12->13->20->14,  x = 12, y = 20
Output: 10->15->20->13->12->14

Input:  10->15->12->13->20->14,  x = 10, y = 20
Output: 20->15->12->13->10->14

Input:  10->15->12->13->20->14,  x = 12, y = 13
Output: 10->15->13->12->20->14
 */
public class SwapNodes {

	static Node head;

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

	public void showList(Node node) {
		// Node tmp = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void swapNode(int x, int y) {

		if (x == y) {
			return;
		}
		// Search for x (keep track of prevX and CurrX) , previous to position 'x' and
		// currently at 'x'
		Node prevX = null, currX = head;

		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and CurrY) , previous to position 'y' and
		// currently at 'y'

		Node prevY = null, currY = head;

		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapNodes list = new SwapNodes();
		list.insertData(10);
		list.insertData(20);
		list.insertData(30);
		list.insertData(40);
		list.insertData(50);
		list.insertData(60);
		list.insertData(70);

		list.showList(head);

		list.swapNode(30, 40);
	}

}
