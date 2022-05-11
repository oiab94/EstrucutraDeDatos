import java.util.Stack;
/**
 * Código de java implementando framework
 */
public class Test {
  // Insertar un elemento en la parte superior de la pila
  public static void stack_push(Stack<Integer> stack) {
    for (int i = 0; i < 5; i++)
      stack.push(i);
  }
  
  // Sacar un elemento de la parte superior de la pila
  public static void stack_pop(Stack<Integer> stack) {
    System.out.println("Quita un elemento:");
    for (int i = 0; i < 5; i++) {
      Integer y = (Integer) stack.pop();
      System.out.println(y);
    }
  }

  // Muestra el elemento superior de la pila
  public static void stack_peek(Stack<Integer> stack) {
    Integer element = (Integer) stack.peek();
    System.out.println("Elemento en la parte superior: " + element);
  }

  // Busca un elemento de la pila
  public static void stack_search(Stack<Integer> stack, int element) {
    Integer pos = (Integer) stack.search(element);

    if(pos == -1)
      System.out.println("Elemento no encontrado");
    else
      System.out.println("Elemento encontrado en la posicón: " + pos);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    stack_push(stack);
    stack_pop(stack);
    stack_push(stack);
    stack_peek(stack);
    stack_search(stack, 2);
    stack_search(stack, 6);

    System.out.println(stack);
  }
}