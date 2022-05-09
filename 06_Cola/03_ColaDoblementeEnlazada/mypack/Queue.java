package mypack;

public class Queue {
  // Variables
  QNode front, rear;


  // Constructor
  public Queue() {
    this.front = this.rear = null;
  }

  // Método para agregar una clave a la cola
  public void enqueue(int key) {
    // Crea una nueva lista enlazada
    QNode temp = new QNode (key);

    // Si la cola está vacía, entonces
    // el nuevo nodo es front y rear
    if (this.rear == null) {
      this.front = this.rear = temp;
      return;
    }

    // Añade el nuevo nodo al final de la cola y cambia rear
    this.rear.next = temp;
    this.rear = temp;
  }

  // Método para remover una key de la cola
  public void dequeue() {
    // Si la cola está vacía, retorna null
    if (this.front == null)
      return;

    // Almacena el front anterior y mueve una posición más
    Node temp = this.front;
    this.front = this.front.next;

    // Si front es null, entonces cambiar rear tambien como null
    if (this.front == null) this.rear = null;
  }


  public static void main(String[] args) {
    Queue q = new Queue();

    q.enqueue(10);
    q.enqueue(20);
    q.dequeue();
    q.dequeue();
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.dequeue();
    System.out.println("Queue front: "+ q.front.key);
  }
}
