package principal;

import java.util.concurrent.Semaphore;

public class hilosInicio extends Thread {
  // TODO Apartado 1) Declarar los atributos para almacenar un identificador (tipo
  // entero) y las referencias a los semáforos necesarios
  private int id;
  private Semaphore semaphore;
  private RecursoCompartido RC;

  // TODO Apartado 2) Declarar un atributo para almacenar la longitud del array
  // del recurso compartidocon y otro atributo para almacenar la referencia al
  // RecursoCompartido

  // TODO Apartado 1) Realizar el constructor para iniciar los atributos con los
  // valores pasados por parámetro.
  public hilosInicio(RecursoCompartido RC, Semaphore semaphore, int id) {
    this.semaphore = semaphore;
    this.RC = RC;
    this.id = id;
  }

  // TODO Apartado 2) Realizar las modificaciones necesarias al constructor para
  // tener acceso al RecursoCompartido. Y pasarle también el tamaño del array
  // existente en el RecursoCompartido (para saber cuantos valores aleatorios
  // debe generar el hilo y almacenar en el array)

  // TODO Apartado 1) Gestionar los permisos de los semáforos para asegurar la
  // ejecución de los hilos en el orden indicado en la figura del enunciado. Los
  // hilos sólo mostrarán en consola su identificador.

  // TODO Apartado 2) Completar lo anterior para generar tantos valores aleatorios
  // enteros como la mitad del tamaño del array existente en el RecursoCompartido.
  // Tras generar cada valor aleatorio debe mostrar en consola el valor generado,
  // y llamar al método adecuado del RecursoCompartido para almacenar el valor en
  // el array existente en el RecursoCompartido.

  @Override
  public void run() {
    try {
      sleep(2000);
    } catch (Exception e) {
    }

    System.out.println("Semaphore number: " + id);
    semaphore.release(2);
  }
}
