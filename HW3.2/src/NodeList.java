
public class NodeList {
	 private int size = 0;
	 private Node root = null;

	 public void add(Node x) {
		 if (x == null) return;
		 if (root == null) {
			 Node newNode = new Node(0, x.getName());
			 root = newNode;
			 }
		 else {
			 Node currentNode = root;
			 while(currentNode.getNext()!=null){
				 currentNode = currentNode.getNext();
			 }
			 int id = currentNode.getData();
			 id ++;
			 Node newNode = new Node(id, x.getName());       
			 currentNode.setNext(newNode);
            }
		 size++;
    }
	 	
	 public int size() {
        return size;
    }
	    
    public boolean findNode(Node node){
  
	    	if(node==null) return false;
        Node currentNode = root;
        while(currentNode.getName()!= node.getName())
        {
            currentNode = currentNode.getNext();
            if(currentNode == null)
	            	return false;
	        	}
	        return true;
	    }

    public void iterate(){
      Node temp = root;
      while (temp != null){
        System.out.println(root);
        temp = root.getNext();

    }
    }
}
