public class DoublyNodeList {
	public static Node head = null;
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
	
	public void deleteNode(int index){
		if (head == null) return;
		if (index < 1 || index > size) return;
		
		Node current = head;
		int i = 1;
		while(i < index){
			current = current.next;
			i++;
		}
		if (current.next == null){
			current.previous.next = null;
		}
		else if(current.previous == null){
			current = current.next;
			current.previous = null;
			head = current;
		}
		else{
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size++;
		Integer.toString(i);
		Integer.toString(index);
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
		size++;
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
		String a = "alpha";
		String b = "beta";
		String c = "gamma";
		
		x.listForward(a);
		x.listForward(b);
		x.listForward(c);
		x.listBackward("-------");
		x.listBackward(a);
		x.listBackward(b);
		x.listBackward(c);
		x.listBackward("-------");
		x.print();
		System.out.println("The Beta node will be deleted");
		x.deleteNode(Integer.parseInt("2"));
		x.deleteNode(Integer.parseInt("5"));
		x.listBackward("-------");
		x.print();
		
		Node node1 = new Node(a);
		System.out.println("Length : "+x.size());
        if(x.findNode(node1))
            System.out.println("Node found: "+node1.Data());
        else
            System.out.println("Node not found: "+node1.Data());
        
		Node node2 = new Node(b);
        if(x.findNode(node2))
            System.out.println("Node found: "+node2.Data());
        else
            System.out.println("Node not found: "+node2.Data());
        
		Node node3 = new Node(c);
        if(x.findNode(node3))
            System.out.println("Node found: "+node3.Data());
        else
            System.out.println("Node not found: "+node3.Data());
        

   
                }
            }
        
        


