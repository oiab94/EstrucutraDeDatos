/**
 * Un programa en java que ilustra la creación de un array 
 * de enteros, poner algunos valores en el array, y imprimir 
 * algunos valores en la salida estandar.
 */
public class GFG {

  public static void main(String[] args) {
    //Declara un array de enteros
    int[] arr;

    //Asigna memoría para 5 enteros
    arr = new int[5];

    //Inicializa el primer elemento del array
    arr[0] = 10;

    //Inicializa el segundo elemento del array
    arr[1] = 20;

    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    //Accede a los elementos del array
    for (int i = 0; i < arr.length; i++)
      System.out.println("Elemento en el indice " + i +
                                            ": "  + arr[i]);
  }
}