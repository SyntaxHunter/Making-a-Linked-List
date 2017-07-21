
public class LinkedList implements LinkedListInterface {
	Node start = null;
	Node end = null;
	int size = 0;
	
	@Override
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void addFirst(Object data) {
		Node prev = start;
		Node start = new Node();
		start.setData(data);
		start.setNext(prev);
		size++;
	}
	
	@Override
	public void addLast(Object data) {
		Node temp = start;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(new Node(data, null));
		size++;
	}
	
	@Override
	public void add(Object data, int index) {
		Node temp = start;
		int pos = 0;
		while(pos < index - 2){
			temp = temp.getNext();
			pos++;
		}
		Node next = temp.getNext();
		temp.setNext(new Node(data, next));
		size++;
	}
	
	@Override
	public void remove(int index) {
		Node temp = start;
		int pos = 0;
		while(pos < index - 2){
			temp = temp.getNext();
			pos++;
		}
		temp.setNext(temp.getNext().getNext());
		size--;
	}
	
//	@Override
//	public String toString(){
//		String str = "";
//		Node temp = start;
//		for(int i = 0; i < size; i++){
//			str += temp.getData();
//			temp = temp.getNext();
//		}
//		return str;
//	}
	
}
