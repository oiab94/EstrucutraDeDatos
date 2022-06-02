/**
 * Programa recursivo que permite encontrar el ancho de un arbol 
 */
public class AnchoArbolBinarioOptimizado {
	// Clase contiene hijo izquierdo y derecho de un nodo y un valor para la clave
	static class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	// Una útil clase height que permite hacer pasar un objeto height
	public class Height{
		int h;
	}

	// Variables
	Node root;

	// Define height=0 globalmente y llama 
	// diameterOpt(root, height) desde main
	int diameterOpt(Node root, Height height){
		// Caso de que root sea nulo
		if (root == null){
			height.h = 0;
			return 0;			// El diametro es tambien 0
		}

		// leftHeight  -> altura del subarbol izquierdo
		// rightHeight -> altura del subarbol derecho
		Height leftHeight = new Height();
		Height rightHeight = new Height();

		// Obtiene la altura de los nodos hijos root.left y root.right 
		// Almacena los valores retornados en leftDiameter y rightDiameter
		// leftDiameter -> diametro del subarbol izquierdo
		// rightDiamenter -> diametro del subarbol derecho
		int leftDiameter = diameterOpt(root.left, leftHeight);
		int rightDiamenter = diameterOpt(root.right, rightHeight);
		
		// Determinamos cual de los hijos tiene el la mayor altura + 1
		height.h = Math.max(leftHeight.h, rightHeight.h) + 1;
		
		return Math.max(leftHeight.h + rightHeight.h, 
										Math.max(leftDiameter, 
															rightDiamenter));
	}
	
	int diameter(){
		Height height = new Height();
		return diameterOpt(root, height);
	}

	// La función computa la "altura" de un árbol. 
	// La altura es el número de nodos f máximo a lo largo del camino más largo 
	// desde el root hasta el nodo más lejano
	static int height(Node node){
		// Caso base
		if(node == null) return 0;

		return Math.max(height(node.left), 
										height(node.right));		
	}

	// Test código
	public static void main(String[] args) {
		AnchoArbolBinarioOptimizado tree = new AnchoArbolBinarioOptimizado();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("El diametro del arbol es: " + tree.diameter());
	}
}