public class ListaEnlazada {
  Node head;    // Cabeza de la lista

  /**
   * Objeto Node
   */
  public class Node {
    int data;
    Node next;

    // Constructor para la creación de una Nodo
    // Por default next es inicializado como
    // null
    public Node(int data){
      this.data = data; 
    }
  }
}
