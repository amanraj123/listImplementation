package listImpl;


// Floyd cycle detection algo 
public class FindLoop {

	// Node head;

	static LinkList list = null;

	// static Node node=null;
	public static void main(String[] args) {

		FindLoop findLoop = new FindLoop();
		createListWithLoop();
		findLoop.detectLoop();

		// we have created a list having loop , to
	}

	public static void createListWithLoop() {

		list = new LinkList();
		list.insert(15);
		list.insert(25);
		list.insert(35);
		list.insert(45);
		list.insert(55);
		System.out.println(list.head.data);
		list.head.next.next.next.next = list.head.next;
		//list.show();
	}

	public int detectLoop() {
		// Node node = new Node();
		int count = 0;
		Node slow_pointer = list.head, fast_pointer = list.head;

		while (slow_pointer != null && fast_pointer != null && fast_pointer.next != null) {
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
			count ++;

			if (slow_pointer == fast_pointer) {
				System.out.println("Found Loop in current list \n" + "value of slow pointer " + slow_pointer.data +"\n"+"value of fast pointer : " + fast_pointer.data);
				System.out.println("length of loop "+ count);
				return 1;
			}
		}
		System.out.println("no loop ");
		return 0;

	}
	
	public void identifyStartOfloop() {
		
	}

}
