import java.util.PriorityQueue;


public class PriorityQueueDemo {
  public static void main(String[] args) {
    // Crea una cola de prioridad vacía
    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

    // Añade los items utilizando el método add de pQueue
    pQueue.add(10);
    pQueue.add(20);
    pQueue.add(15);

    // Imprime el elemento top de PriorityQueue
    System.out.println(pQueue.peek());

    // Imprime el elemento top y saca el elemento
    // de la cola prioritaria
    System.out.println(pQueue.poll());

    // Imprime el elemeto top
    System.out.println(pQueue.peek());
  }
  
}