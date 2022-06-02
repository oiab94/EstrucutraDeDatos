public class MultiDimensional {
  public static void main(String[] args) {
    // Declaración e inicialización de un array en 2D
    int arr[][] ={{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

    // Impresión de un array 2D
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
