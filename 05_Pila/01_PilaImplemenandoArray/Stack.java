public class Stack {
  // Variables
  static final int MAX = 1000;
  int top;
  int a[] = new int[MAX];     // Tamaño máximo de la pila

  // Constructor
  public Stack() {
    top = -1;
  }


  /**
   * Verfica si la pila se encuentra vacia
   * @return true si esta vacia, sino false
   */
  public boolean isEmpty() {
    return (top < 0);
  }


  /**
   * Inserta un nuevo valor en la pila 
   * @param x variable que se quiere insertar en la pila
   * @return true si es insertado correctamente, false de lo contrario
   */
  public boolean push(int x) {
    if (top >= (MAX - 1)) {
      System.out.println("Pila desbordada");
      return false;
    } 
    else {
      a[++top] = x;
      System.out.println(x + " insertado en la pila");
      return true;
    }
  }


  /**
   * Quita un elemento de la lista
   * @return 0 en caso de que la pila no tenga elementos
   *         de lo contrario el valor del último elemento
   *         en la pila
   */
  public int pop() {
    if (top < 0) {
      System.out.println("Pila desbordada");
      return 0;
    } 
    else {
      int x = a[top--];
      return x;
    }
  }


  /**
   * Devuelve el último elemento agregado
   * @return x
   */
  public int peek() {
    if (top < 0) {
      System.out.println("Pila debordada");
      return 0;
    } else {
      int x = a[top];
      return x;
    }
  }


  /**
   * Imprime la pila
   */
  public void print() {
    for (int i = top; i > -1; i--) {
      System.out.print(" " + a[i]);
    }
  }


  public static void main(String[] args) {
    Stack s = new Stack();

    s.push(10);
    s.push(20);
    s.push(30);
    System.out.println(s.pop() + " sacado de la pila");
    System.out.println("El elemento superior es: "+ s.peek());
    System.out.print("Elementos presente en la pila: ");
    s.print();
  }
}