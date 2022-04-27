public class EliminarNodoEnUnaPosicion {
  // Cabecera de la lista
  Node head;

  /**
   * Node
   */
  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }


  /**
   * Inserta un nuevo nodo al frente de la lista
   */
  public void push(int new_data) {
    // 1 & 2: Asigna un nodo e inserta un nuevo dato
    Node new_node = new Node(new_data);

    // 3: Hace que next del nuevo nodo apunte a head
    new_node.next = head;

    // 4: Hace que head ahora sea el nuevo nodo
    head = new_node;    
  }


  /**
   * Dado una referencia hacia a la cabecera de la lista enlazada
   * y una posición, elimina un nodo dado esa posición
   */
  public void deleteNode(int position) {
    // Si la lista se encuentra vacia
    if (head == null)
      return;

    // Almacena el nodo cabecera
    Node temp = head;


    // 1: Si la cabecera necesita removerse
    if (position == 0) {
      head = temp.next;   // Cambia la cabecera
      return;
    }

    // 2: Encuentra el nodo anterior al nodo que se desea eliminar
    for (int i = 0; temp != null && i < position - 1; i++)
      temp = temp.next;

    // 3: Si position es mayor a la cantidad de nodos
    if (temp == null || temp.next == null)
      return;

    // 4: Como el nodo temp->next es el nodo que desea ser eliminado
    //    Almacena el puntero next del nodo que desea eliminar
    Node next = temp.next.next;

    // Saca el nodo a ser eliminado de la lista
    temp.next = next;
  }


  /**
   * Imprime la lista enlazada
   */
  public void printList() {
    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
  }


  public static void main(String[] args) {
    // Inicia la lista enlazada vacia
    EliminarNodoEnUnaPosicion list = new EliminarNodoEnUnaPosicion();

    list.push(60);
    list.push(50);
    list.push(40);
    list.push(30);
    list.push(20);
    list.push(10);

    System.out.println("\nLa lista enlazada creada:");
    list.printList();

    list.deleteNode(0);   // Elimina el nodo de la posición 0

    System.out.println("\nLista enlazada después de eliminar la posición 0");
    list.printList();

    list.deleteNode(2);

    System.out.println("\nLista enlazada después de eliminar la posición 2");
    list.printList();
  }
}
