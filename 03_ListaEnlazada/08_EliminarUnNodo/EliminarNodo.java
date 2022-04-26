public class EliminarNodo {
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
   * Dado una clave, elimina la primera
   * aparición de la clave en la lista enlazada
   */
  public void deleteNode(int key) {
    // Almacena el nodo head
    Node temp = head, prev = null;

    // Verifica si el nodo cabecera tiene la clave
    if (temp != null && temp.data == key) {
      head = temp.next;   //Cambia la cabecera
      return;
    }

    // Busca en la lista el nodo que se desea eliminar
    while (temp != null && temp.data != key) {
      prev = temp;
      temp = temp.next;
    }

    // Si la clave no se encuentra en la lista enlazada
    if (temp == null) {
      return;
    }

    // Desconecta el nodo de la lista enlazada
    prev.next = temp.next;
  }


  /**
   * Inserta un nodo al frente de la lista
   */
  public void push(int new_data) {
    Node new_node = new Node(new_data);

    new_node.next = head;
    head = new_node;
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


  /**
   * Prueba de los métodos de eliminación de nodos
   */
   public static void main(String[] args) {
    EliminarNodo list = new EliminarNodo();
    
    list.push(7);
    list.push(1);
    list.push(3);
    list.push(2);

    System.out.println("\nLista Enlazada creada:");
    list.printList();

    System.out.println("\nLista Enlazada después de eliminar 1");
    list.deleteNode(1);
    list.printList();
    }
}
