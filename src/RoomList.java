
public class RoomList {
	private Node first = null;
	private Node last = null;
	private int size = 0;
	
	public void add (Room room){
		Node node = new Node();
		node.setObj(room);
		if(first==null){
			first = node;
			node.setNext(null);
			node.setPrev(null);
		}else{
			last.setNext(node);
			node.setPrev(last);
			node.setNext(null);	
		}
		last = node;
		size++;	
	}
	
	
	public void add (Room room, int pos){
		if(pos>size){
			add(room);
		}
		else{
			Node node = new Node();
			node.setObj(room);
			Node currentNode = find (pos);
			if (currentNode != null){
				currentNode.getPrev().setNext(node);
				node.setPrev(currentNode.getPrev());
				node.setNext(currentNode);
				currentNode.setPrev(node);
				size++;	
			}
		}
	}
	
	
	public void print(){
		Node n = first;
		while(n!=null){
			System.out.println(n.getObj().toString());
			n=n.getNext();
		}
	}
	
	public Node find(int pos) {			
		if (pos<=0) return  first;		
		if (pos>=size) return  last;
		
		Node n = first;					
		int i=0;
		while (n!=null && i<pos) {		
		    n=n.getNext();				
		    i++;
		}
		return n;
	    }

 
class Node{
	private Room obj = null;
	private Node next = null;
	private Node prev = null;
	public Room getObj() {
		return obj;
	}
	public void setObj(Room obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
}