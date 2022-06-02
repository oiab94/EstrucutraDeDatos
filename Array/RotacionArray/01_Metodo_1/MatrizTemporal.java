// Escribir una función rotar(arr[], d, n) de n elementos 
// por d elementos
public class MatrizTemporal {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5 ,6 ,7};
    int d = 2;
    int n = 7;

    // Almacenar los primeros elementos d en un array temporal
    int[] temp = new int[d];
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    
    // Desplazar el resto del arr[]
    int[] array = new int[n];
    int j = 0;
    for (int i = d; i < array.length; i++) {
      array[j] = arr[i];
      j++;
    }

    j = 0;
    for (int i = n-d; i < array.length; i++) {
      array[i] = temp[j];
      j++;
    }

    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
