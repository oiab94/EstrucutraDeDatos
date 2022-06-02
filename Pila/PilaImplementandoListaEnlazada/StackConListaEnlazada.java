public class StackConListaEnlazada {
  // Variables
  StackNode root;


  public class StackNode {
    // Variables
    int data;
    StackNode next;

    public StackNode(int data) {
      this.data = data;
    }
    
  }
  

  /**
   * Verifica si la pila se encuentra vacía
   * @return true, si la pila está vacia
   *         false, si no está vacía
   */
  public boolean isEmpty() {
    if (root == null) {
      return true;
    }
    return false;
  }



  /**
   * Agrega un nuevo dato a la pila
   * @param data
   */
  public void push(int data) {
    StackNode newNode = new StackNode(data);

    if (root == null) {
      root = newNode;
    } else {
      StackNode temp = root;
      root = newNode;
      newNode.next = temp;
    }

    System.out.println(data + " agregado a la pila");
  }


  /**
   * Saca un dato de la pila
   * @return dato que se saco
   */
  public int pop() {
    int popped = Integer.MIN_VALUE;
    
    if (root == null) {
      System.out.println("La pila está vacía");
    } 
    else {
      popped = root.data;
      root = root.next;  
    }

    return popped;
  }


  /**
   * Verifica el último dato ingresado
   * @return el último dato ingresado
   */
  public int peek() {
    if (root == null) {
      System.out.println("La pila está vacía");
      return Integer.MIN_VALUE;
    }
    
    return root.data;
  }


  public static void main(String[] args) {
    StackConListaEnlazada sl = new StackConListaEnlazada();

    sl.push(10);
    sl.push(20);
    sl.push(30);

    System.out.println(sl.pop() + " sacado de la pila");
    System.out.println("Elemento superior: " + sl.peek());
  }
}