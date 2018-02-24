package learning.ds.algo;

public class MyLinkedList {
	
	private Node start;
	
	public MyLinkedList(){
		start= null;
	}
	
	public boolean deleteNode(String data){
		boolean flag=false;
		
		if(start==null) {
			return flag;
		}else {
			Node current_node = start;
			Node previous_node = null;
			while(current_node!=null) {
				if(current_node.getData().equals(data)) {
					if(current_node.getNextNode()!=null) {
						
					}
				}
				current_node=current_node.getNextNode();
			}
		}
		
		return flag;
	}
	
	public void addNode(String data){
		if(start==null) {
			start=new Node(data);
		}else {
			Node current_node = start;
			while(current_node.getNextNode()!=null) {
				current_node=current_node.getNextNode();
			}
			current_node.setNextNode(new Node(data));
		}
	}
	
	public void displayLinkedList() {
		Node current_node = start;
		if(current_node==null) {
			System.out.println(" ---Blank List---");
		}else {
			do {
				System.out.print(" --> " +current_node.getData());
				current_node=current_node.getNextNode();
			} 
			while(current_node!=null && current_node.getNextNode()!=null);
			System.out.println("");
		}
	}
	
	public static void main(String[] hjkhj) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.displayLinkedList();
		myLinkedList.addNode("Manish");
		myLinkedList.displayLinkedList();
		myLinkedList.addNode("Ashish");
		myLinkedList.addNode("Mohan");
		myLinkedList.addNode("Hemant");
		myLinkedList.addNode("Raaj");
		myLinkedList.displayLinkedList();
	}

}

class Node {

	private Node nextNode;
	private String data;
	
	public Node(String data) {
		this.data=data;
		this.nextNode=null;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [nextNode=" + nextNode.getData() + ", data=" + data + "]";
	}
}