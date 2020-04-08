package Session_17;

public class Client_LL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addLast(40);
		list.display();
		list.reversePR();
		list.display();
		
		list.bubbleSort();
		list.display();
		

	}

}
