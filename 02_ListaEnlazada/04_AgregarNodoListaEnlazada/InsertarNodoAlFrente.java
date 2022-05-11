public class InsertarNodoAlFrente {

  /**
   * Está es una función de Lista Enlazada.
   * Inserta un nuevo nodo al frente de la lista
   */
  public void push(int newData) {
    // 1 & 2: Asigna un nodo e inserta su dato
    Node newNodo = new Node(newData);

    // 3: Hace que next apunte a head
    newNode.next = head;

    // 4: Hace que head apunte a newNode
    head = newNode;
  }
}