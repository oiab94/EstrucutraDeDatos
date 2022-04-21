public class Inversion {
  // Funcion que rota a la izquierda un array de tamaño n por d
  public static void leftRotate(int arr[], int d) {
    if (d == 0) return;

    int n = arr.length;
    // En caso de que el factor de rotación 
    // es más grande que el tamaño del array
    d = d % n;
    reverseArray(arr, 0, d - 1);
    reverseArray(arr, d, n - 1);
    reverseArray(arr, 0, n - 1);
  }

  // Función que invierte un arr[] desde un indice inicio al final
  public static void reverseArray(int arr[], int start, int end) {
    int temp;
    while (start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  // Imprime un array
  public static void printArray(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int n = arr.length;
    int d = 2;

    leftRotate(arr, d);
    printArray(arr);
  }
}