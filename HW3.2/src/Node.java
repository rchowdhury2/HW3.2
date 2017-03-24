
public class Node{
	public String data;
	public Node previous;
	public Node next;
	
	public Node(String data){
		previous = null;
		this.data = data;
		next = null;
	}
	public Node(Node previous, String data, Node next){
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	public String data(){
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}