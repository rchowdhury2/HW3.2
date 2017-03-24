
public class DoublyNodeList {
	public Node head;
	public int size;
	
	DoublyNodeList(){
		head = null;
		size = 0;
	}
	public boolean isEmpty(){
		return (head == null);
	}
	public void addFront(String data){
		if (head == null){
			head = new Node(null, data, head);
		}
		else{
			Node newNode = new Node(null, data, head);
			head.previous = newNode;
			head = newNode;
			}
		size++;
		}
	public void addBack(String data){
		if (head == null){
			head = new Node(null, data, head);
		}
		else{
			Node current = head;
			while(current.next != null){
				current = current.next;
				}
		Node newNode = new Node(current, data, null);
		current.next = newNode;
		}
	}
	
	public int size(){
		return size;
	}
	
	public void print(){
		Node current = head;
		while(current != null){
			System.out.println(current.Data());
			current = current.next;
			}
		}
		
	
	public static void main(String[] args){
		DoublyNodeList x = new DoublyNodeList();
		x.addFront("hi");
		x.addFront("test");
		x.print();
		x.addBack("hola");
		x.print();
		
	}
}

