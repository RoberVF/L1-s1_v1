package principal;

import java.util.concurrent.Semaphore;

public class RecursoCompartido {
      private int sumaT3, sumaT4;
      // TODO Declarar un array de objetos Dato, un semáforo, un atributo para
      // almacenar la longitud del array y un atributo para almacenar cuál es la
      // primera posicion disponible del array
      private Dato[] dato;
      private Semaphore semaphore;
      private int size;
      private int firstPosition;

      // TODO Iniciar, dentro del constructor, el semáforo a estado abierto, crear
      // el array de enteros de tamaño longitud, iniciar el atributo longitud al
      // valor pasado por parámetro e iniciar como primera posicion libre del array
      // la posición 0
      public RecursoCompartido(int size) throws Exception {
            this.semaphore = new Semaphore(0, true);
            this.size = size;
            this.dato = new Dato[size];
            this.firstPosition = 0;

            if (size % 2 != 0)
                  // el parametro longitud recibido debe ser par, sino se genera una Excepcion
                  throw new Exception();
            sumaT3 = -1;
            sumaT4 = -1;

      }

      // TODO Crea un objeto Dato con los parámetros identificador y valor, y lo
      // almacena en la primera posición disponible del array. El parametro
      // identificador corresponde con el identificador del hilo que llama al método.
      // La operación se debe realizar en exclusión mutua
      public void iniciarPosVector(int identificador, int valor) throws InterruptedException {
            Dato[] dato1 = new Dato[2];
            dato1[firstPosition] = new Dato(identificador, valor);

      }

      // TODO Suma los valores del array cuyo identificador es igual al valor del
      // identificador pasado por parametro (que corresponde con el identificador
      // del hilo que llama al método)
      // La operación se debe realizar en exclusión mutua
      public int sumar(int identificador) throws InterruptedException {

            // Por mi para evitar errores
            return identificador;

      }

      // Presenta el contenido del array
      public void presentarVector() throws InterruptedException {

      }

      // Obtiene el contenido de sumaT3
      public int getSumaT3() {
            return this.sumaT3;
      }

      // Establece el valor de sumaT3
      public void setSumaT3(int suma) {
            this.sumaT3 = suma;
      }

      // Obtiene el contenido de sumaT4
      public int getSumaT4() {
            return this.sumaT4;
      }

      // Establece el valor de sumaT4
      public void setSumaT4(int suma) {
            this.sumaT4 = suma;
      }
}
