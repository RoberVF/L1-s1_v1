package principal;

import java.util.concurrent.Semaphore;

public class hiloFinal extends Thread {
  // TODO Apartado 1) Declarar los atributos para almacenar un identificador (tipo
  // entero) y las referencias a los semáforos necesarios
  private int id;
  private Semaphore semaphore3Ends, semaphore4Ends;

  // TODO Apartado 2) Declarar un atributo para almacenar la referencia al
  // RecursoCompartido

  // TODO Apartado 1) Realizar el constructor para iniciar los atributos con los
  // valores pasados por parámetro
  public hiloFinal(Semaphore semaphore3Ends, Semaphore semaphore4Ends, int id) {
    this.semaphore3Ends = semaphore3Ends;
    this.semaphore4Ends = semaphore4Ends;
    this.id = id;
  }

  // TODO Apartado 2) Realizar las modificaciones necesarias al constructor para
  // tener acceso al RecursoCompartido

  // TODO Apartado 1) Gestionar los permisos del semáforo para asegurar la
  // ejecución
  // de los hilos en el orden indicado en la figura del enunciado. Los hilos sólo
  // mostrarán en consola su identificador.
  // TODO Apartado 2) Mostrar en consola el contenido del array llamando al método
  // adecuado del RecursoCompartido. Luego obtener los valores de las sumas
  // calculadas por los threads T3 y T4, e indicar cuál de las dos valores es
  // mayor y qué thread lo calculó.
  @Override
  public void run() {
    try {
      semaphore3Ends.acquire();
      semaphore4Ends.acquire();
      sleep(2000);
    } catch (Exception e) {
    }

    System.out.println("Semaphore number: " + id);
  }
}
