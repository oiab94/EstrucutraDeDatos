public class MetodosListaEnlazada {
  // Cabecera de la lista
  Node head;

  /**
   * Node
   */
  public class Node {
    int data;
    Node next;
    
    // Constructor
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  /**
   * Inserta un nuevo nodo en frente de la lista
   */
  public void push(int new_data) {
    // 1 & 2: Asigna un nodo e inserta un dato
    Node new_node = new Node(new_data);

    // 3: El nuevo nodo ahora apunta a la cabecera 
    new_node.next = head;

    // 4: Convierte el nuevo nodo como cabecera
    head = new_node;
  }

  /**
   * Inserta un nuevo nodo después de otro nodo
   */
  public void insertAfter(Node prev_node, int new_data) {
    // 1: Verifica si el nodo es nulo
    if (prev_node == null) {
      System.out.println("El nodo no puede ser nulo");
      return;
    }

    // 2 & 3: Asigna un nuevo nodo e inserta un dato
    Node new_node = new Node(new_data);

    // 4: Hace que next del nuevo nodo apunte al next del nodo anterior
    new_node.next = prev_node.next;

    // 5: Hace que next del nodo anterior apunte al nuevo nodo
    prev_node.next = new_node;
  }


  /**
   * Añade el nuevo nodo al final
   */
  public void append(int new_data) {
    // 1: Asigna un nuevo nodo
    // 2: Inserta un dato
    Node new_node = new Node(new_data);

    // 3: Si la lista se encuentra vacia, entonces 
    //    el nuevo nodo es la cabecera
    if (head == null) {
      head = new Node(new_data);
      return;
    }

    // 4: Recorre hasta el final de la lista
    Node last = head;
    while (last.next != null)
      last = last.next;

    // 5: Cambia next al nuevo nodo
    last.next = new_node;
    return;
  }


  /**
   * Imprimir la lista
   */
  public void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
  }


  public static void main(String[] args) {
    // Inicia la lista enlazada
    MetodosListaEnlazada list = new MetodosListaEnlazada();

    // Inserta 6. Entonces la lista 6 -> null
    list.append(6);

    // Inserta 7 al inicio. Entonces la lista 7->6->null
    list.push(7);

    // Inserta 1 al inicio. Entonces la lista 1->7->6->null
    list.push(1);

    // Inserta 4 al final. Entonces la lista 1->7->6->4->null
    list.append(4);

    // Inserta 8 después del 7. Entonces la lista 1->7->8->6->4->null
    list.insertAfter(list.head.next, 8);

    System.out.println("\nLista Enlazada: ");
    list.printList();
  }
}
