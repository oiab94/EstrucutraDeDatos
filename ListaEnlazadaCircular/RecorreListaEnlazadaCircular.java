package ListaEnlazadaCircular;

public class RecorreListaEnlazadaCircular {
  /**
   * Node
   */
  public static class Node {
    int data;
    Node next;    
  }


  /**
   * Función para insertar un nodo al 
   * principio de la lista enlazada circular
   */
  public static Node push(Node head_ref, int data) {
    Node new_node = new Node();
    Node temp = head_ref;
    new_node.data = data;
    new_node.next = head_ref;

    //Si la lista es nula entonces inicia next como último nodo
    if (head_ref != null) {
      while (temp.next != head_ref)
        temp = temp.next;
      temp.next = new_node;
    }
    else
      new_node.next = new_node;

    head_ref = new_node;
    
    return head_ref;
  }

  /**
   * Imprimir lista circular
   */
  public static void printList(Node head) {
    Node temp = head;

    if (temp != null) {
      do {
        System.out.print(temp.data + " ");
        temp = temp.next;
      } while (temp != head);
    }
  }


  public static void main(String[] args) {
    Node head = null;

    head = push(head, 12);
    head = push(head, 56);
    head = push(head, 2);
    head = push(head, 11);

    System.out.println("Lista Circular");
    printList(head);    
  }
}
