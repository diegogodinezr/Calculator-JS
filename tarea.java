
public class NumberConverter {

  /**
   * Convierte un número en base 10 a una base determinada.
   *
   * @param numero El número a convertir.
   * @param base La base a la que se desea convertir el número.
   * @return La cadena que representa el número convertido.
   */
  public static String convertir(int numero, int base) {
    if (base < 2) {
      throw new IllegalArgumentException("La base debe ser mayor o igual a 2.");
    }
    // Inicializa un StringBuilder para construir la representación del número en base 10.
    StringBuilder resultado = new StringBuilder();
    while (numero > 0) {
      int residuo = numero % base;//Residuo de la division del numero entre la base
      resultado.insert(0, residuo);//Inserta el residuo al principio de la cadena resultante
      numero = numero / base;//Actualiza el numero dividiendolo por la base
    }
    // Devuelve la representación del número en base 10 como una cadena.
    return resultado.toString();
  }

}