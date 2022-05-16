public class ArbolBinario {
    /**
     * Node
     */
    public class Node {
        int key;
        Node left, right;
        
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    /**
     * Un programa que introduce sobre un árbol binario
     */
    // Raiz del árbol
    Node root;

    // Constructor
    public ArbolBinario(int key) {
        root = new Node(key); 
    }
    public ArbolBinario() {
        root = null;
    }

    public static void main(String[] args) {
        ArbolBinario tree = new ArbolBinario();

        // Creación de una raiz
        tree.root = new Node(1);

        /* Se obtiene lo siguiente
                1
              /   \
            null  null
        */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        /* 2 y 3 son hijos de 1
                      1
                 /         \
               2            3
             /   \        /   \
           null  nulll  null  null
        */
    }
}