package principal;

import java.util.concurrent.Semaphore;

public class Main {
  public static void main(String[] arg) {
    // TODO Apartado 1) Crear los hilos y semáforos necesarios para establecer
    // el orden de ejecucion indicado en la figura.
    RecursoCompartido RC = new RecursoCompartido(10);
    Semaphore semaphore1Ends = new Semaphore(0, true);
    Semaphore semaphore2Ends = new Semaphore(0, true);
    Semaphore semaphore3Ends = new Semaphore(0, true);
    Semaphore semaphore4Ends = new Semaphore(0, true);

    hilosInicio T1 = new hilosInicio(RC, semaphore1Ends, 1);
    hilosInicio T2 = new hilosInicio(RC, semaphore2Ends, 2);

    hilosMedio T3 = new hilosMedio(semaphore1Ends, semaphore2Ends, semaphore3Ends, 3);
    hilosMedio T4 = new hilosMedio(semaphore1Ends, semaphore2Ends, semaphore4Ends, 4);

    hiloFinal T5 = new hiloFinal(semaphore3Ends, semaphore4Ends, 5);

    T1.start();
    T2.start();
    T3.start();
    T4.start();
    T5.start();

    // TODO Apartado 2) Crear el recurso compartido y realizar las modificaciones
    // necesarias en las llamadas a los constructores de cada hilo.
    // RECORDAR QUE EL PARÁMETRO DEL CONSTRUCTOR DE LA CLASE RecursoCompartido
    // DEBE SER PAR (SI NO, SE PRODUCIRÁ UNA EXCEPCIÓN).

  }
}
