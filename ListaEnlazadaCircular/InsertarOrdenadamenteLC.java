package ListaEnlazadaCircular;

public class InsertarOrdenadamenteLC {
  /**
   * Node
   */
  public class Node {
    int data;
    Node next;
    
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  public InsertarOrdenadamenteLC() {
    head = null;
  }

  public void sortedInsert(Node new_Node) {
    Node current = head;

    // Caso 1
    if (current == null) {
      new_Node.next = new_Node;
      head = new_Node;
    }

    // Caso 2
    else if(current.data >= new_Node.data){
      // Si el valor es mayor entonces debemos buscar su posición
      while (current.next != head)
        current = current.next;
      
      current.next = new_Node;
      new_Node.next = head;
      head = new_Node;
    }

    // Caso 3
    else{
      while (current.next != head && 
             current.next.data < new_Node.data) {
        new_Node.next = current.next;
        current.next = new_Node;
      }
    }
  }

  /**
   * Imprimir la lista
   */
  public void printList() {
    if (head != null) {
      Node temp = head;
      do {
        System.out.print(temp.data + " ");
        temp = temp.next;
      } while (temp != head);
    }
  }
}
