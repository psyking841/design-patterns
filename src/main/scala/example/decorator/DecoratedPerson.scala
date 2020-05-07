package example.decorator

import example.decorator.person.Person

abstract class DecoratedPerson extends Person {
  protected var person: Person = _
  def setPerson(p: Person): Unit = person = p
  def show: Unit = person.show
}
