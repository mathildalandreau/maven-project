package com.example;
/**
 * Classe exemple pour javadoc.
 * @author MAthilda
 * @version 1.0
 * @since 18/0682021
 */
public class Greeter {
/**
* Creates an empty Greeter.
*/
  public Greeter() {

  }
/**
*Methode qui renvoit "Hello babacar".
* @param someone une personne
* @return String une phrase
*/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
