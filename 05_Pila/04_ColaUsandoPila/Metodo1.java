import java.util.Stack;

public class Metodo1 {
  
  public static class Queue {
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2= new Stack<Integer>();
  
    // Encolar
    public static void enQueue(int x) {
      // Mueve todos los elementos de s1 a s2
      while (!s1.isEmpty()) s2.push(s1.pop());

      // Mete el item dentro de s1
      s1.push(x);

      // Mete todos los elementos de nuevo a s1
      while (!s2.isEmpty()) s1.push(s2.pop());
    }

    // Desencolar
    public static int deQueue() {
      // Si la pila se encuentra vacía
      if (s1.isEmpty()) {
        System.out.println("Q está vacía");
        System.exit(0);
      }

      // Retorna superior de s1
      int x = s1.peek();
      s1.pop();
      return x;
    }
  };
  
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);

    System.out.println(q.deQueue());
    System.out.println(q.deQueue());
    System.out.println(q.deQueue());
  }
}