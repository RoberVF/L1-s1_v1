package principal;

import java.util.concurrent.Semaphore;

public class hilosMedio extends Thread {
  // TODO Apartado 1) Declarar los atributos para almacenar un identificador (tipo
  // entero) y las referencias a los semáforos necesarios
  private int id;
  private Semaphore semaphore1Ends, semaphore2Ends, sem;

  // TODO Apartado 2) Declarar un atributo para almacenar la referencia al
  // RecursoCompartido

  // TODO Apartado 1) Realizar el constructor para iniciar los atributos con los
  // valores pasados por parámetro
  public hilosMedio(Semaphore semaphore1Ends, Semaphore semaphore2Ends, Semaphore sem, int id) {
    this.semaphore1Ends = semaphore1Ends;
    this.semaphore2Ends = semaphore2Ends;
    this.sem = sem;
    this.id = id;
  }

  // TODO Apartado 2) Realizar las modificaciones necesarias al constructor para
  // tener acceso al RecursoCompartido

  // TODO Apartado 1) Gestionar los permisos del semáforo para asegurar la
  // ejecución
  // de los hilos en el orden indicado en la figura del enunciado. Los hilos sólo
  // mostrarán en consola su identificador.
  // TODO Apartado 2) Completar lo anterior, llamando al método adecuado del
  // RecursoCompartido para sumar los valores aleatorios almacenados en los
  // objetos Dato en el array existente (considerando sólo aquellos objetos con
  // el identificador apropiado).
  // La suma calculada debe almacenarse en el atributo adecuado, sumaT3 o sumaT4
  // del RecursoCompartido.
  @Override
  public void run() {
    try {
      semaphore1Ends.acquire();
      semaphore2Ends.acquire();
      sleep(2000);
    } catch (Exception e) {
    }

    System.out.println("Semaphore number: " + id);
    sem.release(1);

  }
}
