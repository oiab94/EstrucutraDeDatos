// Una programa simple para introducir a la Lista Enlazada
public class ListaEnlazadaSimple {
  // Cabecera de la lista
  Node head;

  // Nodo lista enlazada
  public static class Node {
    int data;
    Node next;
    
    // Constructor Node
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  // Creación de una lista enlazada simple con 3 nodos
  public static void main(String[] args) {
    // Se inicia con una lista enlazada vacia
    ListaEnlazadaSimple list = new ListaEnlazadaSimple();
    
    list.head = new Node(1);
    Node segundo = new Node(2);
    Node tercero = new Node(3);

    /* Tres nodos han sido asignado dinámicamente.
       Nosostros tenemos referencia a estos tres 
       bloques como cabeza, segundo y tercero

       list.head          segundo         tercero
          |                 |               |
          |                 |               |
       +---+------+      +---+------+      +---+-----.+
       | 1 | null |      | 2 | null |      | 3 | null |
       +---+------+      +---+------+      +---+------+ */

    list.head.next = segundo;   // Enlaza el primer nodo con el segundo nodo
    
    /* Ahora el primer nodo hace referencia al segundo nodo. Ambos están enlazados
      
       list.head          segundo         tercero
          |                 |               |
          |                 |               |
       +---+------+      +---+------+      +---+-----.+
       | 1 |  o -------->| 2 | null |      | 3 | null |
       +---+------+      +---+------+      +---+------+ */
    
    segundo.next = tercero;
    
    /* Ahora el segundo nodo se encuentra enlazado al terce nodo

       list.head          segundo         tercero
          |                 |               |
          |                 |               |
       +---+------+      +---+------+      +---+-----.+
       | 1 |  o -------->| 2 |  o--------->| 3 | null |
       +---+------+      +---+------+      +---+------+ */
  }
}
