public class ComprobacionCompletoONo {
	class Node {
		int data;
		Node left, right;
		
		public Node(int item) {
			data = item;
			left = right = null;
		}
	}
	
	
	// Variables
	Node root;


	// Verifica si un árbol es completo o no
	public static boolean isFullTree(Node node) {
		// Si se encuentra vacio
		if (node == null) return true;

		// Si el nodo es una hoja
		if (node.left == null &&
				node.right == null)
				return true;

		// Si los subarboles izquierda y derecha no son nulos 
		// ellos son completos
		if (node.left != null && 
				node.right != null)
			return isFullTree(node.left) && isFullTree(node.right);

		// Si ninguno funciona
		return false;
	}


	// Test código
	public static void main(String[] args) {
		ComprobacionCompletoONo tree = new ComprobacionCompletoONo();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.right = new Node(40);
		tree.root.left.left = new Node(60);
		tree.root.left.left.left = new Node(80);
		tree.root.right.right = new Node(70);
		tree.root.left.left.right = new Node(90);
		tree.root.left.right.left = new Node(80);
		tree.root.left.right.right = new Node(90);
		tree.root.right.left.left = new Node(80);
		tree.root.right.left.right = new Node(90);
		tree.root.right.right.left = new Node(80);
		tree.root.right.right.right = new Node(90);
		
		if (tree.isFullTree(tree.root))
			System.out.println("Es full");
		else
			System.out.println("No es full");
	}
}