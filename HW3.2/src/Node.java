
public class Link {
	public String data;
	public Node previous;
	public Node next;
	
	public Link(String data){
		previous = null;
		this.data = data;
		next = null;
	}
	public Link(String data, Node previous, Node next){
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