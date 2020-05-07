package example.decorator

import example.decorator.person.Engineer

object ShowClient extends App {
  /**
   * Decorator patten adds new behaviors/states to existing class.
   * In this example, we extend the show method of Person object
   */
  val person = new Engineer("Shengyi")
  val clothPerson = new WaringClothesPerson
  val pantsPerson = new WaringPantsPerson
  clothPerson.setPerson(person)
  pantsPerson.setPerson(clothPerson)
  pantsPerson.show
}
