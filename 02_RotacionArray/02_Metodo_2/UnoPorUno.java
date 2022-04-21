public class UnoPorUno {
  //Función para rotar a la izquierda un array de tamaño n por d
  public void leftRotate(int arr[], int d, int n) {
    for (int i = 0; i < d; i++) {
      leftRotateByOne(arr, n);
    }
  }

  public void leftRotateByOne(int arr[], int n) {
    int i, temp;
    temp = arr[0];

    for (i = 0; i < n-1; i++)
      arr[i] = arr[i+1];
    arr[n-1] = temp;
  }

  //Imprime el arreglo
  public void printArray(int arr[], int n) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
  public static void main(String[] args) {
    UnoPorUno rotate = new UnoPorUno();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    
    rotate.leftRotate(arr, 2, 7);
    rotate.printArray(arr, 7);
  }
}
