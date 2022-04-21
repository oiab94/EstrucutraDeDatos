public class DividiendoArray {
  //Rotación a la izquierda del array
  public void leftRotate(int arr[], int d, int n) {
    //En el caso de que d >= n
    d = d % n;
    int i, j, k, temp;
    int g_c_d = gcd(d, n);

    for (i = 0; i < g_c_d; i++) {
      //Mueve los i-esimo valores del bloque
      temp = arr[i];
      j = i;
      while(true){
        k = j + d;

        if(k >= n) k = k - n;
        if(k == i) break;

        arr[j] = arr[k];
        j = k;
      }
      arr[j] = temp;
    }
  }
  
  public int gcd(int a, int b) {
    if (b == 0) return a;
    else return gcd(b, a%b);
  }

  public void printArray(int arr[], int size) {
    for (int j = 0; j < size; j++) {
      System.out.print(arr[j] + " ");
    }
  }

  public static void main(String[] args) {
    DividiendoArray rotate = new DividiendoArray();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    rotate.leftRotate(arr, 2, 7);
    rotate.printArray(arr, 7);
  }
}
