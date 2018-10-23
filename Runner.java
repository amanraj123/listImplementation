package listImpl;

public class Runner {

	public static void main(String[] args) {

		LinkList list = new LinkList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insertAtStart(11);
		list.insertAt(2, 44);
		list.insertAt(3, 54);
		list.insertAt(4, 64);
		list.insertAt(0, 111);
		list.insertAt(0, 112);
		list.insertAt(0, 113);
		// list.insertAt(-1, 111);
		list.show();

		System.out.println("=============after delete=========");

		list.deleteAt(3);

		list.show();
		list.size();
	}

	public static void createListHavingLoop() {

	}

}
