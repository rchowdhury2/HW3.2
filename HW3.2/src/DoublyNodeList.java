
public class DoublyNodeList {
	public Node head;
	public String size;
	
	DoublyNodeList(){
		head = null;
		size = "";
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
	}
		
	public static void main(String[] args){
		int x = 5;
		System.out.println(x);
	}
}

