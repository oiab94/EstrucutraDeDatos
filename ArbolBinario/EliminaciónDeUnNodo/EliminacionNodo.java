import java.util.LinkedList;
import java.util.Queue;

public class EliminacionNodo {
	// Variabeles
	static Node root;
	static Node temp = root;


	// Recorrido inorder de un árbol binario
	public static void inorder(Node temp) {
		if(temp == null) return;

		inorder(temp.getLeftNode());
		System.out.print(temp.getKey() + " ");
		inorder(temp.getRightNode());
	}

	// Elimina el elemento más profundo en un árbol binario
	public static void deleteDeepest(Node root, 
																	 Node delNode) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		Node temp = null;

		//Realiza un recorrido por orden de nivel hasta el último nodo
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp == delNode) {
				temp = null;
				return;
			}

			if (temp.getRightNode() != null) {
				if (temp.getRightNode() == delNode) {
					temp.setRightNode(null);
					return;
				}
				else q.add(temp.getRightNode());
			}

			if (temp.getLeftNode() != null) {
				if (temp.getLeftNode() == delNode) {
					temp.setLeftNode(null);
					return;
				} 
				else q.add(temp.getLeftNode());
			}
		}
	}


	// Elimina dado un dato en un arbol binario
	public static void delete(Node root, 
														int key) {
		if (root == null) return;

		if (root.getLeftNode() == null && 
				root.getRightNode() == null) {
			if (root.getKey() == key) {
				root = null;
				return;
			}
			else return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null, keyNode = null;

		// Realiza un recorrido hasta encontrar el último nodo
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.getKey() == key) keyNode = temp;
			if (temp.getLeftNode() != null) q.add(temp.getLeftNode());
			if (temp.getRightNode() != null) q.add(temp.getRightNode());
		}

		if (keyNode != null) {
			int x = temp.getKey();
			deleteDeepest(root, temp);
			keyNode.setKey(x);
		}
	}


	// Test código
	public static void main(String[] args) {
		root = new Node(10);
		
		root.setLeftNode(new Node(11));
		root.getLeftNode().setLeftNode(new Node(7));
		root.getLeftNode().setRightNode(new Node(12));

		root.setRightNode(new Node(9));
		root.getRightNode().setLeftNode(new Node(15));
		root.getRightNode().setRightNode(new Node(8));
	
		System.out.println("Antes de la eliminacion");
		inorder(root);
		System.out.println();

		System.out.println("Despues de la eliminacion");
		delete(root, 12);
		inorder(root);
		System.out.println();
	}
}
