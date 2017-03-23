public class Node {
	public int data = 0;
	public String name = "";
	public Node next;
	
	public Node(int data, String name, Node next){
		this.data = data;
		this.name = name;
		this.next = next;
	}
	
	public String toString(){
		return name;
	}
}
