
public class DoublyNodeList {
	public Node head = null;
	public int size = 0;
	
	public boolean isEmpty(){
		return (head == null);
	}
	public void listForward(String data){
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
	public void listBackward(String data){
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
	
	public boolean findNode(Node node){
        if(node==null) return false;
        Node currentNode = head;
        while(currentNode.Data()!= node.Data())
        {
            currentNode = currentNode.getNext();
            if(currentNode == null)
                return false;
        }
        return true;
    }
		
	public static void main(String[] args){
		DoublyNodeList x = new DoublyNodeList();
		x.listForward("a");
		x.listForward("b");
		x.listForward("c");
		x.listBackward("-------");
		x.listBackward("a");
		x.listBackward("b");
		x.listBackward("c");
		x.print();
		
		Node node1 = new Node("a");
		System.out.println("Length : "+x.size());
        if(x.findNode(node1))
            System.out.println("Node found: "+node1.Data());
        else
            System.out.println("Node not found: "+node1.Data());
       
		
	}
}

