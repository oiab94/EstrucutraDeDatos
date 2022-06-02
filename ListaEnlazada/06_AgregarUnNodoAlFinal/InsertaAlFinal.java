/**
 * Inserta un nuevo nodo al final de la lista.
 * Esté es un método de la lista enlazada
 */

public class InsertaAlFinal {
  public void insertaAlFinal(int newData) {
    // 1: Asigna un nodo
    // 2: Asigna un dato al nodo
    Node newNode = new Node(newData);

    // 3: Si la lista enlazada esta vacia, entonces 
    //    realiza newNode como cabezera
    if(head == null){
      head = new Node(newData);
      return ;
    }

    // 4: Recorre hasta el último nodo
    Node last = head;
    while(last.next != null)
      last = last.next;

    // 5: Cambia el next del nodo final
    last.next = newNode;
    return;
  }  
}
