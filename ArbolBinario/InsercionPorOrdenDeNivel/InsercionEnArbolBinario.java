import java.util.LinkedList;
import java.util.Queue;

public class InsercionEnArbolBinario {
	// Variables
	static Node root;
	static Node temp = root;


	// Recorrido Inorder de un árbol binario
	public static void inorder(Node temp) {
		if (temp == null) {
			return;
		}

		inorder(temp.getLeftNode());
		System.out.print(temp.getKey() + " ");
		inorder(temp.getRightNode());
	}

	// Inserta un elemento al árbol binario
	public static void insert(Node temp, int key) {
		if (temp == null) {
			root = new Node(key);
			return;
		}
		Queue<Node> qNodes = new LinkedList<Node>();
		qNodes.add(temp);

		// Realiza un recorrido inorder hasta encontrar un posición vacia
		while (!qNodes.isEmpty()) {
			temp = qNodes.peek();
			qNodes.remove();
			
			if (temp.getLeftNode() == null) {
				temp.setLeftNode(new Node(key));
				break;
			}
			else qNodes.add(temp.getLeftNode());

			if (temp.getRightNode() == null) {
				temp.setRightNode(new Node(key));
				break;
			} 
			else qNodes.add(temp.getRightNode());
		}
	}

	public static void main(String[] args) {  
		root = new Node(10);
		root.setLeftNode(new Node(11));
		root.getLeftNode().setLeftNode(new Node(7));
		root.setRightNode(new Node(9));
		root.getRightNode().setLeftNode(new Node(15));
		root.getRightNode().setRightNode(new Node(8));

		// Antes de la insercion
		System.out.println("Inorder antes de la insercion");
		inorder(root);
		System.out.println();

		// Después de la insercion
		insert(root, 12);
		System.out.println("Inorder despues de la insercion");
		inorder(root);
		System.out.println();x
	}
}
