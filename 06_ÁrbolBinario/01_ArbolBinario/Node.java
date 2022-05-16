/**
 * Representación del nodo de un árbol binario
 */
public class Node {
    public int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}