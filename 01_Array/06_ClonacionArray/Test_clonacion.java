// Demostración de como clonar un array en JAVA
public class Test_clonacion {
  public static void main(String[] args) {
    int intArray[] = {1, 2, 3};
    int cloneArray[] = intArray.clone();

    // Imprime falso si la copia fue creada
    System.out.println(intArray == cloneArray);

    for (int i = 0; i < cloneArray.length; i++) {
      System.out.print(cloneArray[i] + " ");
    }
  }
}
