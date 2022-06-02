/**
 * Está es una función de la Lista Enlazada.
 * Inserta un nuevo nodo después de otro nodo.
 */

public class InsertarDespues {
  public void insertarDespues(Node prevNode, int newData) {
    // 1: Chequear si prevNode es null
    if(prevNode == null){
      System.out.println("El nodo previo no puede ser null");
      return ;
    }
    
    // 2 & 3: Asigna el nodo e inserta el dato
    Node newNode = new Node();
    
    // 4: Asigna a next del nuevo nodo el nodo next del nodo anterior
    newNode.next = prevNode.next;

    // 5: Asigna a next del nodo anterior el nuevo nodo.
    prevNode.next = newNode;
  }
}
