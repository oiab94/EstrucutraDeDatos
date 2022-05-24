// Nodo	
class NodeAB{
	int data;
	NodeAB left, right;

	public NodeAB(int data) {
		this.data = data;
		left = right = null;
	}
}


public class AnchoArbolBinario {
	// Variables
	NodeAB root;


	// Método para calcular el ancho y retornarlo al main
	public int diameter(NodeAB root) {
		// Caso Base: El árbol está vacio
		if(root == null) return 0;

		// Obtener la altura de los subarboles izquierdo y derecho
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		// Obtener el ancho de los subarboles izquierdo y derecho
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);

		/* Retorna el máximo de los tres
			1) Ancho del subarbol izquierdo
			2) Ancho del subarbol derecho
			3) Altura del subarbol izquierdo + altura subarbol derecho + 1
		*/
		return Math.max(leftHeight + rightHeight + 1, 
										Math.max(leftDiameter, rightDiameter));
	}


	// Llamado superior al método diameter
	public int diameter() { return diameter(root); }


	// El método computa la "altura" de un árbol.
	// Height es el número de nodos a lo largo del camino más largo desde la raiz 
	// hasta el nodo más lejano
	public static int height(NodeAB node) {
		// Caso base: El árbol está vacio
		if (node == null) return 0;

		// Si el árbol no se encuentra vacio entonces 
		// height = 1 + la altura máxima izquierda y la altura máxima derecha
		return( 1 + 
						Math.max(height(node.left), 
										 height(node.right)));
	}


	// Test código
	public static void main(String[] args) {
		// Creación de un árbol binario
		AnchoArbolBinario arbol = new AnchoArbolBinario();
		arbol.root = new NodeAB(1);
		arbol.root.left = new NodeAB(2);
		arbol.root.right = new NodeAB(3);
		arbol.root.left.left = new NodeAB(4);
		arbol.root.left.right = new NodeAB(5);

		// Llamada a la función
		System.out.println(
			"El ancho del árbol binario: " +
			arbol.diameter());
	}
}