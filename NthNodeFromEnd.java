package listImpl;

/*
 * Program for n’th node from the end of a Linked List
Given a Linked List and a number n, write a function that returns the value at the n’th node from end of the Linked List.
For example, if input is below list and n = 3, then output is “B”

A--->B---->C---->D
for the given list , if input is 3 then third node from the end is B
 */
public class NthNodeFromEnd {

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
	//	Node tmp = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public Node getNthNodeFromEnd(int nthNode) {

		int length = 0;

		Node tmp = head;

		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}

		if (length < nthNode) {
			System.out.println("\n nth node can not be reached as : " + " length of list is " +length + "<" + " given nth Node " +nthNode);
			return null;
		}
		else {
			tmp =head;
			for( int i=1 ; i < length - nthNode +1 ; i++) {
				tmp = tmp.next;
			}
		}
		System.out.println("\n"+nthNode + " nth Node from the end is :- "+tmp.data);
		return tmp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NthNodeFromEnd list = new NthNodeFromEnd();
		list.insertData(10);
		list.insertData(20);
		list.insertData(30);
		list.insertData(40);
		list.insertData(50);
		list.insertData(60);
		list.insertData(70);

		list.showList(head);
		
		list.getNthNodeFromEnd(3);
	}

}
