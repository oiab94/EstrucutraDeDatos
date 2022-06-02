// Demostración de paso de un array 
// a un método en JAVA
public class Test {
  public static void main(String[] args) {
    int arr[] = {3, 1, 2, 5, 4};

    sum(arr);
  } 
  
  public static void sum(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    System.out.println("Suma de los elementos del array: " + sum);
  }
}
