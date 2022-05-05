public class Queue {
  // Variables
  int front, rear, size;
  int capacity;
  int array[];


  // Constructor
  public Queue(int capacity) {
    this.capacity = capacity;
    front = this.size = 0;
    rear = capacity - 1;
    array = new int[this.capacity];
  }

  // Queue está lleno cuando el tamño
  // iguala a la capacidad
  public boolean isFull(Queue queue) {
    return (queue.size == queue.capacity); }

  // Queue está vacío cuando el tamaño es 0
  public boolean isEmpty(Queue queue) {
    return (queue.size == 0); }

  // Método para añadir un nuevo item a la cola
  // Cambia rear y size
  public void enqueque(int item) {
    if (isFull(this))
      return;
    
      this.rear = (this.rear + 1) % this.capacity;
    this.array[this.rear] = item;
    this.size = this.size + 1;
    System.out.println(item + " encolado en la cola");
  }

  // Método para remover un item de la cola
  // Cambia front y size
  public int dequeque() {
    if (isEmpty(this))
      return Integer.MIN_VALUE;

    int item = this.array[this.front];
    this.front = (this.front + 1) % this.capacity;
    this.size = this.size - 1;

    return item;
  }

  // Método para obtener front de la cola
  public int front() {
    if (isEmpty(this))
      return Integer.MIN_VALUE;

    return this.array[this.front];
  }

  // Método para obtener rear de la cola
  public int rear() {
    if (isEmpty(this))
      return Integer.MIN_VALUE;

    return this.array[this.rear];
  }


  // Test
  public static void main(String[] args) {
    Queue queue = new Queue(1000);

    queue.enqueque(10);
    queue.enqueque(20);
    queue.enqueque(30);
    queue.enqueque(40);

    System.out.println(queue.dequeque() + " desencolado de la cola\n");
    System.out.println("El item front es: " + queue.front());
    System.out.println("El item rear es: " + queue.rear());
  }
}
