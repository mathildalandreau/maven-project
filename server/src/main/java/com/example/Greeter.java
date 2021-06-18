package com.example;
/**
 * Classe exemple pour javadoc
 * @author bcaylux
 * @version 1.0 
 */
public class Greeter {
/**
*constructeur vide
*/
  public Greeter() {

  }
/** 
*Méthode qui renvoit "Hello babacar" 
*@param someone une personne 
*/
  public final String greet(final String someone) {
    /**
    *@return
    */
    return String.format("Hello babacar, %s!", someone);
  }
}
