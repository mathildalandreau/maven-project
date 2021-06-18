package com.example;



public class Greeter {
/*constructeur vide*/
  public Greeter() {

  }
/* Méthode qui renvoit "Hello babacar" */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
