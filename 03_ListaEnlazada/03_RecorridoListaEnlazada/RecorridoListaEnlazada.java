public class RecorridoListaEnlazada {
  Node head;
  
  // Nodo de una lista enlazada
  public static class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  // Imprime la lista enlazada
  public void printList() {
    Node n = head;

    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
  }

  // Implementa la creación de una lista enlazada con 3 nodos
  public static void main(String[] args) {
    RecorridoListaEnlazada list = new RecorridoListaEnlazada();

    list.head = new Node(1);
    Node segundo = new Node(2);
    Node tercero = new Node(3);

    list.head.next = segundo;
    segundo.next = tercero;

    list.printList();
  }
}
