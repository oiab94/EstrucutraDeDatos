public class Test_clonacionMulti {
  public static void main(String[] args) {
    int intArray[][] = {{1, 2, 3}, {4, 5, 6}};
    int cloneArray[][] = intArray.clone();

    System.out.println(intArray == cloneArray);

    // Se imprimira verdadero si la copia es creada
    System.out.println(intArray[0] == cloneArray[0]);
    System.out.println(intArray[1] == cloneArray[1]);
  }
}
