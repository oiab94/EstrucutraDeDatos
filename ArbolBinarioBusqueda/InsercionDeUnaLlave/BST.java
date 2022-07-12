public class BST {
	// Variables
	Node root;


	// Constructor
	public BST() { root = null; }

	public BST(int key) { root = new Node(key); }

	// Este método llama a insertRec
	public void insert(int key) { root = insertRec(key, root); }

	// Función recursiva que inserta una nueva clave
	public Node insertRec(int key, Node root) {
		// Si el arbol esta vacia retorna un nuevo nodo
		if (root == null) {
			root = new Node(key); 
			return root;
		}

		// Sino recorrer el arbol recursivamente
		if (key < root.getKey()) {
			root.setLeftNode(
							insertRec(key, root.getLeftNode()));
		}
		else if(key > root.getKey()){
			root.setRightNode(
							insertRec(key, root.getRightNode()));
		}

		return root;
	}

	// Este método llama a inorderRec
	public void inorder() { inorderRec(root); }

	// Recorre un arbol de forma inorder
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.getLeftNode());
			System.out.print(root.getKey() + " ");
			inorderRec(root.getRightNode());
		}
	}


	// Test Código
	public static void main(String[] args) {
		BST tree = new BST();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();
	}
}