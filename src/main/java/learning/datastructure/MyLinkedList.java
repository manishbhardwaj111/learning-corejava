package learning.datastructure;

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
		
	public void displayLinkedList() {
		Node current_node = start;
		if (current_node == null) {
			System.out.println(" ---Blank List---");
		} else {
			while (current_node != null) {
				System.out.print(" --> " + current_node.getData());
				current_node = current_node.getNextNode();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] hjkhj) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addNode("10");
		myLinkedList.displayLinkedList();
		myLinkedList.addNode("20");
		myLinkedList.addNode("30");
		myLinkedList.addNode("40");
		myLinkedList.addNode("50");
		myLinkedList.addNode("60");
		myLinkedList.displayLinkedList();
	}
	
	public void addNode(String data) {
		Node addNode = new Node(data);
		if(start == null)	{
			start = addNode;
		}else {
			Node currentNode = start;
			while(currentNode.getNextNode()!=null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(addNode);
		}	
	}
	
	private static class Node {

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
}