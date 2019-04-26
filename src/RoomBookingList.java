
public class RoomBookingList {
	private Node first = null;
	private Node last = null;
	private int size = 0;
	
	
	public void add (AddBooking reservation){
		Node node = new Node();
		node.setObj(reservation);
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
	
	public void add (AddBooking reservation, int pos){
		if(pos>size){
			add(reservation);
		}
		else{
			Node node = new Node();
			node.setObj(reservation);
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
	
	public Node find(int pos) {			// метод поиска ноды
		if (pos<=0) return  first;			// если нода, которую мы ищем стоит в нулевой позиции, тогда возвращаем значение first
		if (pos>=size) return  last;
		
		Node n = first;						//если нода не первая, тогда перебираем список
		int i=0;
		while (n!=null && i<pos) {			// выполняется цикл до тех пор пока i не дойдет до значения pos и далее
		    n=n.getNext();					// кладём в n следующий елемент(например мы ищем 3, тогда при значении i=2 цикл выполняется последний раз и в n кладем следующий элемент т. е. n=3)
		    i++;
		}
		return n;
	    }
}

class Node{
	private AddBooking obj = null;
	private Node next = null;
	private Node prev = null;
	public AddBooking getObj() {
		return obj;
	}
	public void setObj(AddBooking obj) {
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