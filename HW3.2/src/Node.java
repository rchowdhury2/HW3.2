public class Node {
	public int data = 0;
	public String name = "";
	public Node next;
	
	public Node(int data, String name){
		this.data = data;
		this.name = name;
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		this.next = node;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return name + data;
	}

}	