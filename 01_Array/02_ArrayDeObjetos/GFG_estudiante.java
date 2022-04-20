// Programa en java que ilustra la creación 
// de un array de objetos
public class GFG_estudiante {
  public static void main(String[] args) {
    // Declara un array de objetos
    Estudiante[] arr;

    // Asigna memoria para 5 objetos del tipo Estudiante
    arr = new Estudiante[5];

    // Inicializa el primer elemento del array
    arr[0] = new Estudiante(1, "Amam");

    // Inicializa el segundo elemento del array
    arr[1] = new Estudiante(2, "Vaibhav");

    arr[2] = new Estudiante(3, "Shikar");
    arr[3] = new Estudiante(4, "Dharmesh");
    arr[4] = new Estudiante(5, "Mohit");

    // Accede a los elementos del array
    for (int i = 0; i < arr.length; i++)
      System.out.println("Elemento en " + i +
          ": " + arr[i].roll_no +
          " " + arr[i].name);
  }
}
