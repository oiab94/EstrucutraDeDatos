public class Node {
	// Variables
	private int key;
	private Node leftNode, rightNode;


	//Constructor
	public Node(int key) {
		this.key = key;
		leftNode = rightNode = null;
	}


	// Setters Getters
	public void setKey(int key) { this.key = key; }
	public void setLeftNode(Node leftNode) { this.leftNode = leftNode; }
	public void setRightNode(Node rightNode) { this.rightNode = rightNode; }

	public int getKey() { return key; }
	public Node getLeftNode() { return leftNode; }
	public Node getRightNode() { return rightNode; }

	// Retorna datos del nodo
	@Override
	public String toString() {
		return String.format("Key:%3s -> LeftNode:%6b  RightNode:%6b%n", 
													key, leftNode, rightNode);
	}
}
